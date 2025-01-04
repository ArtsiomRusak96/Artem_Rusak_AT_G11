package tests.classwork;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homework.BookingPage;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisTest {

    WebDriver webDriver;
    BookingPage bookingPage;

    @Before
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
        bookingPage = new BookingPage(webDriver);
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void bookingParisTest() {

        LocalDate startDate = LocalDate.now().plusDays(3);
        LocalDate endDate = startDate.plusDays(7);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("Paris");
        bookingPage.setDates(startDate, endDate);
        bookingPage.addPersons(2);
        bookingPage.addRooms(1);

        bookingPage.search();
        bookingPage.closePopup();

        waitElement("(//input[contains(@aria-label,'5 звезд')]/following-sibling::label/span[2])[1]").click();

        clickElement("//button[@data-testid='sorters-dropdown-trigger']");
        waitElement("//div[@data-testid='property-card'][1]");
        clickElement("//button[@aria-label='Оценка объекта (по возрастанию)']");

        waitElement("(//div[@data-testid='rating-stars'])[1]");
        int stars = webDriver.findElements(By.xpath("(//div[@data-testid='rating-stars'])[1]/span")).size();

        assertEquals("The hotel rate should be:", 5, stars);
    }

    private void clickElement(String xpath) {
        webDriver.findElement(By.xpath(xpath)).click();
    }

    private WebElement waitElement(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}

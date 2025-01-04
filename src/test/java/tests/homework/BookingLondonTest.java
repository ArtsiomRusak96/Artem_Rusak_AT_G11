package tests.homework;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import pages.homework.BookingPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingLondonTest {

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
    public void bookingLondonTest() {

        LocalDate startDate = LocalDate.now().plusDays(3);
        LocalDate endDate = startDate.plusDays(5);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("London");
        bookingPage.setDates(startDate, endDate);

        bookingPage.search();
        bookingPage.closePopup();

        WebElement hotel = findElement("//div[@data-testid='property-card'][10]");
        WebElement hotelTitle = findElement("//div[@data-testid='property-card'][10]//div[@data-testid='title']");
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = 'green'", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = 'red'", hotelTitle);

        byte[] asFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        Path screenshotPath = Paths.get("picture.png");
        try {
            Files.write(screenshotPath, asFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertTrue("Screenshot should be taken", Files.exists(screenshotPath));
    }

    private WebElement findElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }
}

package classwork.day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisTest {

    WebDriver webDriver;

    @Before
    public void launchWebDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void bookingParisTest() {

        LocalDate startDate = LocalDate.now().plusDays(3);
        LocalDate endDate = startDate.plusDays(7);

        webDriver.get("https://www.booking.com/");
        closePopup();

        webDriver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Paris");
        clickElement("//*[@data-testid='searchbox-dates-container']");
        clickElement("//*[@data-date='" + startDate + "']");
        clickElement("//*[@data-date='" + endDate + "']");

        String addPerson = "//*[@id='group_adults']/following-sibling::div[2]/button[2]";
        clickElement("//*[@data-testid='occupancy-config']");
        clickElement(addPerson);
        clickElement(addPerson);

        clickElement("//*[@id='no_rooms']/following-sibling::div[2]/button[2]");
        clickElement("//*[@type='submit']");

        closePopup();
        waitElement("(//input[contains(@aria-label,'5 звезд')]/following-sibling::label/span[2])[1]")
                .click();

        clickElement("//button[@data-testid='sorters-dropdown-trigger']");
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

    private void closePopup() {
        try {
            waitElement("//*[@aria-label='Скрыть меню входа в аккаунт.']").click();
        } catch (Exception ignored) {
        }
    }
}

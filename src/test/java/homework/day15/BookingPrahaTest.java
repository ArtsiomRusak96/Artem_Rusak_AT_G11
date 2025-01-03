package homework.day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingPrahaTest {

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
    public void bookingPrahaTest() {

        LocalDate startDate = LocalDate.now().plusDays(3);
        LocalDate endDate = startDate.plusDays(5);

        webDriver.get("https://www.booking.com/");
        closePopup();

        webDriver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Praha");
        clickElement("//*[@data-testid='searchbox-dates-container']");
        clickElement("//*[@data-date='" + startDate + "']");
        clickElement("//*[@data-date='" + endDate + "']");
        clickElement("//*[@type='submit']");

        closePopup();
        waitAndClickElement("(//input[@name='review_score=90']/following-sibling::label/span[2])[1]");
        waitAndClickElement("(//div[@data-testid='title'])[1]");

        String score = webDriver.findElement(By.xpath("(//div[contains(text(),'Оценка')])[1]")).getText()
                .replaceAll("[^0-9,]", "").replaceAll(",", ".");
        double rate = Double.parseDouble(score);

        assertTrue("Apartment rate should be equal or more than 9.0. Rate equals to: " + rate, rate >= 9);
    }

    private void clickElement(String xpath) {
        webDriver.findElement(By.xpath(xpath)).click();
    }

    private void waitAndClickElement(String xpath) {
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }

    private void closePopup() {
        try {
            waitAndClickElement("//*[@aria-label='Скрыть меню входа в аккаунт.']");
        } catch (Exception ignored) {
        }
    }
}

package homework.day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BookingHoverTest {

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
    public void bookingHoverTest() {

        webDriver.get("https://www.booking.com/");
        closePopup();

        hoverOnElement("//button[@data-testid='header-currency-picker-trigger']");
        assertEquals("The currency tooltip should be:", "Выберите валюту", getElementText("//div[contains(@style,'left: 525px')]"));

        hoverOnElement("//button[@data-testid='header-language-picker-trigger']");
        assertEquals("The currency tooltip should be:", "Выберите язык", getElementText("//div[contains(@style,'left: 592px')]"));
    }

    private WebElement waitElement(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    private void closePopup() {
        try {
            waitElement("//*[@aria-label='Скрыть меню входа в аккаунт.']").click();
        } catch (Exception ignored) {
        }
    }

    private void hoverOnElement(String xpath) {
        new Actions(webDriver).moveToElement(webDriver.findElement(By.xpath(xpath))).perform();
    }

    private String getElementText(String xpath) {
        return waitElement(xpath).getText();
    }
}

package tests.homework;

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

import static org.junit.Assert.assertEquals;

public class BookingHoverTest {

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
    public void bookingHoverTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.hoverOnCurrency();
        assertEquals("The currency tooltip should be:", "Выберите валюту", getElementText("//div[contains(@style,'left: 525px')]"));

        bookingPage.hoverOnLanguage();
        assertEquals("The currency tooltip should be:", "Выберите язык", getElementText("//div[contains(@style,'left: 592px')]"));
    }

    private WebElement waitElement(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    private String getElementText(String xpath) {
        return waitElement(xpath).getText();
    }
}

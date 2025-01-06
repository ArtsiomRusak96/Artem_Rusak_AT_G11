package tests.homework.selenium;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

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
        Driver.closeDriver();
    }

    @Test
    public void bookingHoverTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        String tooltip = "//div[contains(@style,'left:";
        bookingPage.hoverOnCurrency();
        assertEquals("The currency tooltip should be:", "Выберите валюту", bookingPage.getTextOfElement(tooltip + " 525px')]"));

        bookingPage.hoverOnLanguage();
        assertEquals("The currency tooltip should be:", "Выберите язык", bookingPage.getTextOfElement(tooltip + " 592px')]"));
    }
}

package tests.homework.selenium.junit;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

import static org.junit.Assert.assertEquals;

public class BookingHoverJUnitTest {

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

        bookingPage.hoverOnElement(BookingPage.CURRENCY);
        assertEquals("The currency tooltip should be:", "Выберите валюту", bookingPage.getCurrencyTooltipText());

        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
        assertEquals("The language tooltip should be:", "Выберите язык", bookingPage.getLanguageTooltipText());
    }
}

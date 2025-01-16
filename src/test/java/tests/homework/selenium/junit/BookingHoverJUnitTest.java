package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

import static org.junit.Assert.assertEquals;

public class BookingHoverJUnitTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingHoverJUnitTest.class);

    WebDriver webDriver;
    BookingPage bookingPage;

    @Before
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        bookingPage = new BookingPage(webDriver);
    }

    @After
    public void closeWebDriver() {
        LOGGER.info("Test has ended");
        Driver.closeDriver();
    }

    @Test
    public void bookingHoverTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.hoverOnElement(BookingPage.CURRENCY);
        LOGGER.debug("Checking currency tooltip");
        assertEquals("The currency tooltip should be:", "Выберите валюту", bookingPage.getCurrencyTooltipText());

        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
        LOGGER.debug("Checking language tooltip");
        assertEquals("The language tooltip should be:", "Выберите язык", bookingPage.getLanguageTooltipText());
    }
}

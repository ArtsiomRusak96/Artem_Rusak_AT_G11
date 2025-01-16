package tests.homework.selenium.testng;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookingPage;

import static org.testng.Assert.assertEquals;

public class BookingHoverTestNgTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingHoverTestNgTest.class);

    WebDriver webDriver;
    BookingPage bookingPage;

    @BeforeClass
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        bookingPage = new BookingPage(webDriver);
    }

    @AfterClass
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
        assertEquals(bookingPage.getCurrencyTooltipText(), "Выберите валюту", "The currency tooltip should be:");

        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
        LOGGER.debug("Checking language tooltip");
        assertEquals(bookingPage.getLanguageTooltipText(), "Выберите язык", "The language tooltip should be:");
    }
}

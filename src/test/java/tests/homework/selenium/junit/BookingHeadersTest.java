package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

import static org.junit.Assert.assertTrue;

public class BookingHeadersTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingHeadersTest.class);

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
    public void bookingHeadersTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        LOGGER.debug("Searching logo 'Booking.com' on the main page");
        assertTrue("Logo 'Booking.com' should exist on the main page", bookingPage.isHeaderExist(BookingPage.BOOKING_LOGO));

        LOGGER.debug("Searching button 'Currency' on the main page");
        assertTrue("Button 'Currency' should exist on the main page", bookingPage.isHeaderExist(BookingPage.CURRENCY));

        LOGGER.debug("Searching button 'Language' on the main page");
        assertTrue("Button 'Language' should exist on the main page", bookingPage.isHeaderExist(BookingPage.LANGUAGE));

        LOGGER.debug("Searching button 'Help center (?)' on the main page");
        assertTrue("Button 'Help center (?)' should exist on the main page", bookingPage.isHeaderExist(BookingPage.HELP_CENTER));

        LOGGER.debug("Searching button 'Registration your property' on the main page");
        assertTrue("Button 'Registration your property' should exist on the main page", bookingPage.isHeaderExist(BookingPage.REGISTRATION_PROPERTY));

        LOGGER.debug("Searching button 'Registration account' on the main page");
        assertTrue("Button 'Registration account' should exist on the main page", bookingPage.isHeaderExist(BookingPage.REGISTRATION_ACCOUNT));

        LOGGER.debug("Searching button 'Sign in' on the main page");
        assertTrue("Button 'Sign in' should exist on the main page", bookingPage.isHeaderExist(BookingPage.SIGN_IN));
    }
}

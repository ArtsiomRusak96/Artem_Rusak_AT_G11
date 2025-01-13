package tests.homework.selenium.junit;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;

import static org.junit.Assert.assertTrue;

public class BookingHeadersTest {

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
    public void bookingHeadersTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        assertTrue("Logo 'Booking.com' should exist on the main page", bookingPage.isHeaderExist(BookingPage.BOOKING_LOGO));
        assertTrue("Button 'Currency' should exist on the main page", bookingPage.isHeaderExist(BookingPage.CURRENCY));
        assertTrue("Button 'Language' should exist on the main page", bookingPage.isHeaderExist(BookingPage.LANGUAGE));
        assertTrue("Button 'Help center (?)' should exist on the main page", bookingPage.isHeaderExist(BookingPage.HELP_CENTER));
        assertTrue("Button 'Registration your property' should exist on the main page", bookingPage.isHeaderExist(BookingPage.REGISTRATION_PROPERTY));
        assertTrue("Button 'Registration account' should exist on the main page", bookingPage.isHeaderExist(BookingPage.REGISTRATION_ACCOUNT));
        assertTrue("Button 'Sign in' should exist on the main page", bookingPage.isHeaderExist(BookingPage.SIGN_IN));
    }
}

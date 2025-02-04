package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import utils.DatesGenerator;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingPragueJUnitTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingPragueJUnitTest.class);

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
    public void bookingPragueTest() {

        LocalDate startDate = DatesGenerator.generateStartDateDaysAhead(2);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, 5);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("Prague");
        bookingPage.setDates(startDate, endDate);

        bookingPage.search();
        bookingPage.closePopup();

        bookingPage.filterByRateNinePlus();
        bookingPage.openFirstHotel();

        double rate = bookingPage.checkHotelRate();
        LOGGER.debug("Checking the hotel rate");
        assertTrue("Apartment rate should be equal or more than 9.0. Rate equals to: " + rate, rate >= 9);
    }
}

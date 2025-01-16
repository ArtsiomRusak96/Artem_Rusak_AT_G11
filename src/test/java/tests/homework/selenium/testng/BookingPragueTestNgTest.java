package tests.homework.selenium.testng;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookingPage;
import utils.DatesGenerator;

import java.time.LocalDate;

import static org.testng.Assert.assertTrue;

public class BookingPragueTestNgTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingPragueTestNgTest.class);

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
        assertTrue(rate >= 9, "Apartment rate should be equal or more than 9.0. Rate equals to: " + rate);
    }
}

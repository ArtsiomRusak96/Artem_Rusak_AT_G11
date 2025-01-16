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

import static org.junit.Assert.assertEquals;

public class BookingParisJUnitTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingParisJUnitTest.class);

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
    public void bookingParisTest() {

        LocalDate startDate = DatesGenerator.generateStartDateDaysAhead(3);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, 7);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("Paris");
        bookingPage.setDates(startDate, endDate);
        bookingPage.addPersons(2);
        bookingPage.addRooms(1);

        bookingPage.search();
        bookingPage.closePopup();

        bookingPage.filterByFiveStars();
        bookingPage.sortByAscending();

        LOGGER.debug("Checking the hotel rate");
        assertEquals("The hotel rate should be:", 5, bookingPage.checkStarsQuantityFirstHotel());
    }
}

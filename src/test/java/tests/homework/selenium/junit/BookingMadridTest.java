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
import static org.junit.Assert.assertTrue;

public class BookingMadridTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingMadridTest.class);

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
    public void bookingMadridTest() throws InterruptedException {

        LocalDate startDate = DatesGenerator.generateStartDateMonthsAhead(1);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, 5);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("Madrid");
        bookingPage.setDates(startDate, endDate);

        bookingPage.search();
        bookingPage.closePopup();

        bookingPage.addToFavoriteFirstHotel();
        String firstHotelName = bookingPage.getFirstHotelName();

        bookingPage.addToFavoriteLastHotel();
        String lastHotelName = bookingPage.getLastHotelName();

        LOGGER.debug("Checking the first and the last hotels were added to 'Favorites'");
        assertTrue("The first hotel heart should be red", bookingPage.isFirstHotelHeartRed());
        assertTrue("The last hotel heart should be red", bookingPage.isLastHotelHeartRed());

        bookingPage.openMyNextTrips();
        LOGGER.debug("Checking the first and the last hotels were added to 'My next trips' list");
        assertEquals("There should be 2 added hotels to 'My next trips' list", 2, bookingPage.checkHotelsQuantityInMyNextTripsList());
        assertEquals("The first hotel name should be:", firstHotelName, bookingPage.getHotelNameInMyNextTripsList(1));
        assertEquals("The second hotel name should be:", lastHotelName, bookingPage.getHotelNameInMyNextTripsList(2));
    }
}

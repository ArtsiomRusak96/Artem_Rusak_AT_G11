package tests.homework.selenium.junit;

import driver.Driver;
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

        assertTrue("The first hotel heart should be red", bookingPage.isFirstHotelHeartRed());
        assertTrue("The last hotel heart should be red", bookingPage.isLastHotelHeartRed());

        bookingPage.openMyNextTrips();
        assertEquals("There should be 2 added hotels to 'My next trips' list", 2, bookingPage.checkHotelsQuantityInMyNextTripsList());
        assertEquals("The first hotel name should be:", firstHotelName, bookingPage.getHotelNameInMyNextTripsList(1));
        assertEquals("The second hotel name should be:", lastHotelName, bookingPage.getHotelNameInMyNextTripsList(2));
    }
}

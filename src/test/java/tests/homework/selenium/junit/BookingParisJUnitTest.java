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

public class BookingParisJUnitTest {

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

        assertEquals("The hotel rate should be:", 5, bookingPage.checkStarsQuantityFirstHotel());
    }
}

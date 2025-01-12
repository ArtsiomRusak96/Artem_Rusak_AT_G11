package tests.homework.selenium.testng;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookingPage;
import utils.DatesGenerator;

import java.time.LocalDate;

import static org.testng.Assert.assertEquals;

public class BookingParisTestNgTest {

    WebDriver webDriver;
    BookingPage bookingPage;

    @BeforeClass
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
        bookingPage = new BookingPage(webDriver);
    }

    @AfterClass
    public void closeWebDriver() {
        Driver.closeDriver();
    }

    @Test
    public void bookingParisTest() {

        LocalDate startDate = DatesGenerator.generateStartDate(3);
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

        assertEquals(bookingPage.checkStarsQuantityFirstHotel(), 5, "The hotel rate should be:");
    }
}

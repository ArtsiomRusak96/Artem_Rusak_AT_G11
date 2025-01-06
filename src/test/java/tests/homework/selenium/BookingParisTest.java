package tests.homework.selenium;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import utils.DatesGenerator;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisTest {

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

        String star = "(//div[@data-testid='rating-stars'])[1]";
        bookingPage.wait(star);
        int stars = webDriver.findElements(By.xpath(star + "/span")).size();

        assertEquals("The hotel rate should be:", 5, stars);
    }
}

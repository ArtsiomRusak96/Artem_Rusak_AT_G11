package tests.homework.selenium;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import utils.DatesGenerator;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingPragueTest {

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
    public void bookingPragueTest() {

        LocalDate startDate = DatesGenerator.generateStartDate(2);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, 5);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("Prague");
        bookingPage.setDates(startDate, endDate);

        bookingPage.search();
        bookingPage.closePopup();

        bookingPage.filterByRateNinePlus();
        bookingPage.openFirstHotel();

        String score = bookingPage.getTextOfElement("(//div[contains(text(),'Оценка')])[3]")
                .replaceAll("[^0-9,]", "")
                .replaceAll(",", ".");
        double rate = Double.parseDouble(score);

        assertTrue("Apartment rate should be equal or more than 9.0. Rate equals to: " + rate, rate >= 9);
    }
}

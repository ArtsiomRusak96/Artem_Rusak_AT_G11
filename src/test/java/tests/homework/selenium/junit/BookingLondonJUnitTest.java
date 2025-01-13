package tests.homework.selenium.junit;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import pages.BookingPage;
import utils.DatesGenerator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingLondonJUnitTest {

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
    public void bookingLondonTest() {

        LocalDate startDate = DatesGenerator.generateStartDateDaysAhead(4);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, 2);

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.searchCity("London");
        bookingPage.setDates(startDate, endDate);

        bookingPage.search();
        bookingPage.closePopup();

        bookingPage.changeBackgroundAndTitleColors("10", "green", "red");
        Path screenshotPath = bookingPage.takeScreenshot("screenshot.png");

        assertTrue("Screenshot should be taken", Files.exists(screenshotPath));
    }
}

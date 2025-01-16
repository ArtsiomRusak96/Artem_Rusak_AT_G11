package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger LOGGER = LogManager.getLogger(BookingLondonJUnitTest.class);

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

        LOGGER.debug("Checking the file was created and is located in the specified path");
        assertTrue("Screenshot should be taken", Files.exists(screenshotPath));
    }
}

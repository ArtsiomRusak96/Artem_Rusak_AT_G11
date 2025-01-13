package tests.homework.selenium.testng;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookingPage;
import utils.DatesGenerator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

import static org.testng.Assert.assertTrue;

public class BookingLondonTestNgTest {

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

        assertTrue(Files.exists(screenshotPath), "Screenshot should be taken");
    }
}

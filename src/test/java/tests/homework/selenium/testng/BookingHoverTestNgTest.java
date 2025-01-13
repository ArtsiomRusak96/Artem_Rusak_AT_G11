package tests.homework.selenium.testng;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookingPage;

import static org.testng.Assert.assertEquals;

public class BookingHoverTestNgTest {

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
    public void bookingHoverTest() {

        bookingPage.openBooking();
        bookingPage.closePopup();

        bookingPage.hoverOnElement(BookingPage.CURRENCY);
        assertEquals(bookingPage.getCurrencyTooltipText(), "Выберите валюту", "The currency tooltip should be:");

        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
        assertEquals(bookingPage.getLanguageTooltipText(), "Выберите язык", "The language tooltip should be:");
    }
}

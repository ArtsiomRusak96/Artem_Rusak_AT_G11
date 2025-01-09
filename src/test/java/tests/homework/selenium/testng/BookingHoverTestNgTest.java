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

        String tooltip = "//div[contains(@style,'left:";
        bookingPage.hoverOnCurrency();
        assertEquals(bookingPage.getTextOfElement(tooltip + " 525px')]"), "Выберите валюту", "The currency tooltip should be:");

        bookingPage.hoverOnLanguage();
        assertEquals(bookingPage.getTextOfElement(tooltip + " 592px')]"), "Выберите язык", "The language tooltip should be:");
    }
}

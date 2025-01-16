package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import utils.DatesGenerator;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingSteps {

    private static final Logger LOGGER = LogManager.getLogger(BookingSteps.class);

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

    @Given("Open booking site")
    public void openBooking() {
        LOGGER.debug("Opening 'booking.com' site");
        bookingPage.openBooking();
        bookingPage.closePopup();
    }

    @When("Enter {string} into destination field")
    public void enterCity(String city) {
        LOGGER.debug("Filling destination");
        bookingPage.searchCity(city);
    }

    @When("Hover on currency")
    public void hoverOnCurrency() {
        LOGGER.debug("Hovering on 'Currency' button");
        bookingPage.hoverOnElement(BookingPage.CURRENCY);
    }

    @When("Hover on language")
    public void hoverOnLanguage() {
        LOGGER.debug("Hovering on 'Language' button");
        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
    }

    @And("Set desired dates - start in {int} days and duration {int} days")
    public void setDates(int startInDays, int duration) {
        LOGGER.debug("Setting dates");
        LocalDate startDate = DatesGenerator.generateStartDateDaysAhead(startInDays);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, duration);
        bookingPage.setDates(startDate, endDate);
    }

    @And("Set desired {int} persons quantity")
    public void setPersons(int personQuantity) {
        LOGGER.debug("Setting persons quantity");
        bookingPage.addPersons(personQuantity);
    }

    @And("Set desired {int} rooms quantity")
    public void setRooms(int roomQuantity) {
        LOGGER.debug("Setting rooms quantity");
        bookingPage.addRooms(roomQuantity);
    }

    @And("Click 'Search' button")
    public void clickSearchButton() {
        LOGGER.debug("Clicking on 'Search' button");
        bookingPage.search();
        bookingPage.closePopup();
    }

    @And("For hotel № {string} - change background color on {string} and title color on {string}")
    public void changeBackgroundAndTitleColors(String hotelNumber, String backgroundColor, String titleColor) {
        LOGGER.debug("Changing colors of hotel background and title");
        bookingPage.changeBackgroundAndTitleColors(hotelNumber, backgroundColor, titleColor);
    }

    @And("Set filter by 5 stars hotel")
    public void setFiveStarsFilter() {
        LOGGER.debug("Filtering hotels by 5-stars");
        bookingPage.filterByFiveStars();
    }

    @And("Set filter by 9+ rate")
    public void setNinePlusRateFilter() {
        LOGGER.debug("Filtering hotels by 9+ rate");
        bookingPage.filterByRateNinePlus();
    }

    @And("Set sorting by ascending")
    public void setSortingByAscending() {
        LOGGER.debug("Sorting hotels by ascending");
        bookingPage.sortByAscending();
    }

    @And("Open the first hotel in filtered list")
    public void openFirstHotel() {
        LOGGER.debug("Opening the first hotel in the filtered list");
        bookingPage.openFirstHotel();
    }

    @And("Take screenshot with name - {string}")
    public void takeScreenshot(String fileName) {
        LOGGER.debug("Taking screenshot");
        bookingPage.takeScreenshot(fileName);
    }

    @Then("Check the first hotel has {int} stars")
    public void checkStarsQuantity(int expectedStars) {
        LOGGER.debug("Checking stars quantity of the first hotel");
        assertEquals("The hotel rate should be:", expectedStars, bookingPage.checkStarsQuantityFirstHotel());
    }

    @Then("Check the opened hotel rate more than {int}")
    public void checkOpenedHotelRate(int number) {
        LOGGER.debug("Checking the rate of the opened hotel");
        double rate = bookingPage.checkHotelRate();
        assertTrue("Apartment rate should be equal or more than 9.0. Rate equals to: " + rate, rate >= number);
    }

    @Then("Check the created {string} screenshot")
    public void checkCreatedScreenshot(String fileName) {
        LOGGER.debug("Checking screenshot was created");
        assertTrue("Screenshot should be taken", Files.exists(Paths.get(fileName)));
    }

    @Then("Currency tooltip appears")
    public void checkCurrencyTooltip() {
        LOGGER.debug("Checking currency tooltip");
        assertEquals("The currency tooltip should be:", "Выберите валюту", bookingPage.getCurrencyTooltipText());
    }

    @Then("Language tooltip appears")
    public void checkLanguageTooltip() {
        LOGGER.debug("Checking language tooltip");
        assertEquals("The language tooltip should be:", "Выберите язык", bookingPage.getLanguageTooltipText());
    }
}

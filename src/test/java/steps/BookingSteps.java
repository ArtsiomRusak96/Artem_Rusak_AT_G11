package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import utils.DatesGenerator;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingSteps {

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

    @Given("Open booking site")
    public void openBooking() {
        bookingPage.openBooking();
        bookingPage.closePopup();
    }

    @When("Enter {string} into destination field")
    public void enterCity(String city) {
        bookingPage.searchCity(city);
    }

    @When("Hover on currency")
    public void hoverOnCurrency() {
        bookingPage.hoverOnElement(BookingPage.CURRENCY);
    }

    @When("Hover on language")
    public void hoverOnLanguage() {
        bookingPage.hoverOnElement(BookingPage.LANGUAGE);
    }

    @And("Set desired dates - start in {int} days and duration {int} days")
    public void setDates(int startInDays, int duration) {
        LocalDate startDate = DatesGenerator.generateStartDateDaysAhead(startInDays);
        LocalDate endDate = DatesGenerator.generateEndDate(startDate, duration);
        bookingPage.setDates(startDate, endDate);
    }

    @And("Set desired {int} persons quantity")
    public void setPersons(int personQuantity) {
        bookingPage.addPersons(personQuantity);
    }

    @And("Set desired {int} rooms quantity")
    public void setRooms(int roomQuantity) {
        bookingPage.addRooms(roomQuantity);
    }

    @And("Click 'Search' button")
    public void clickSearchButton() {
        bookingPage.search();
        bookingPage.closePopup();
    }

    @And("For hotel № {string} - change background color on {string} and title color on {string}")
    public void changeBackgroundAndTitleColors(String hotelNumber, String backgroundColor, String titleColor) {
        bookingPage.changeBackgroundAndTitleColors(hotelNumber, backgroundColor, titleColor);
    }

    @And("Set filter by 5 stars hotel")
    public void setFiveStarsFilter() {
        bookingPage.filterByFiveStars();
    }

    @And("Set filter by 9+ rate")
    public void setNinePlusRateFilter() {
        bookingPage.filterByRateNinePlus();
    }

    @And("Set sorting by ascending")
    public void setSortingByAscending() {
        bookingPage.sortByAscending();
    }

    @And("Open the first hotel in filtered list")
    public void openFirstHotel() {
        bookingPage.openFirstHotel();
    }

    @And("Take screenshot with name - {string}")
    public void takeScreenshot(String fileName) {
        bookingPage.takeScreenshot(fileName);
    }

    @Then("Check the first hotel has {int} stars")
    public void checkStarsQuantity(int expectedStars) {
        assertEquals("The hotel rate should be:", expectedStars, bookingPage.checkStarsQuantityFirstHotel());
    }

    @Then("Check the opened hotel rate more than {int}")
    public void checkOpenedHotelRate(int number) {
        double rate = bookingPage.checkHotelRate();
        assertTrue("Apartment rate should be equal or more than 9.0. Rate equals to: " + rate, rate >= number);
    }

    @Then("Check the created {string} screenshot")
    public void checkCreatedScreenshot(String fileName) {
        assertTrue("Screenshot should be taken", Files.exists(Paths.get(fileName)));
    }

    @Then("Currency tooltip appears")
    public void checkCurrencyTooltip() {
        assertEquals("The currency tooltip should be:", "Выберите валюту", bookingPage.getCurrencyTooltipText());
    }

    @Then("Language tooltip appears")
    public void checkLanguageTooltip() {
        assertEquals("The language tooltip should be:", "Выберите язык", bookingPage.getLanguageTooltipText());
    }
}

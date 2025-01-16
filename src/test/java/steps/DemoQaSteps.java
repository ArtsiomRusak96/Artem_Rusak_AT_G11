package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.DemoQaPage;

import static org.junit.Assert.assertEquals;

public class DemoQaSteps {

    private static final Logger LOGGER = LogManager.getLogger(DemoQaSteps.class);

    WebDriver webDriver;
    DemoQaPage demoQaPage;

    @Before
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        demoQaPage = new DemoQaPage(webDriver);
    }

    @After
    public void closeWebDriver() {
        LOGGER.info("Test has ended");
        Driver.closeDriver();
    }

    @Given("Open demoqa site")
    public void openDemoQa() {
        LOGGER.debug("Opening 'demoqa.com' site");
        demoQaPage.openDemoQa();
    }

    @When("Select {string} in 'Colors' dropdown")
    public void selectValueInColorsDropdown(String value) {
        LOGGER.debug("Selecting value in 'Colors' dropdown");
        demoQaPage.selectValueInColorsDropdown(value);
    }

    @When("Select {string} and {string} in 'Cars' dropdown")
    public void selectValuesInCarsDropdown(String firstValue, String secondValue) {
        LOGGER.debug("Selecting values in 'Cars' dropdown");
        demoQaPage.selectValueInCarsDropdown(firstValue);
        demoQaPage.selectValueInCarsDropdown(secondValue);
    }

    @When("Select {string} value in 'Groups' dropdown")
    public void selectValueInGroupsDropdown(String value) {
        LOGGER.debug("Selecting value in 'Groups' dropdown");
        demoQaPage.selectValueInGroupsDropdown(value);
    }

    @When("Select {string} value in 'Titles' dropdown")
    public void selectValueInTitlesDropdown(String value) {
        LOGGER.debug("Selecting value in 'Titles' dropdown");
        demoQaPage.selectValueInTitlesDropdown(value);
    }

    @When("Select {string} and {string} in 'Multi Colors' dropdown")
    public void selectValuesInMultiColorsDropdown(String firstValue, String secondValue) {
        LOGGER.debug("Selecting values in 'Multi Colors' dropdown");
        demoQaPage.selectMultiValuesInColorsDropdown(firstValue, secondValue);
    }

    @Then("Check 'Colors' dropdown has {string} value")
    public void checkColorsDropdownValue(String expectedValue) {
        LOGGER.debug("Checking 'Colors' dropdown value");
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getColorsDropdownValue());
    }

    @Then("Check 'Cars' dropdown have {string} values")
    public void checkCarsDropdownValues(String expectedValues) {
        LOGGER.debug("Checking 'Cars' dropdown values");
        assertEquals("Dropdown should have values:", expectedValues, demoQaPage.getCarsDropdownValues());
    }

    @Then("Check 'Groups' dropdown has {string} value")
    public void checkGroupsDropdownValue(String expectedValue) {
        LOGGER.debug("Checking 'Groups' dropdown value");
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getGroupsDropdownValue());
    }

    @Then("Check 'Titles' dropdown has {string} value")
    public void checkTitlesDropdownValue(String expectedValue) {
        LOGGER.debug("Checking 'Titles' dropdown value");
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getTitlesDropdownValue());
    }

    @Then("Check 'Multi Colors' dropdown have {string} values")
    public void checkMultiColorsDropdownValues(String expectedValues) {
        LOGGER.debug("Checking 'Multi Colors' dropdown values");
        assertEquals("Dropdown should have values:", expectedValues, demoQaPage.getMultiColorsDropdownValues());
    }
}

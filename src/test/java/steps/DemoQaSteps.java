package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DemoQaPage;

import static org.junit.Assert.assertEquals;

public class DemoQaSteps {

    WebDriver webDriver;
    DemoQaPage demoQaPage;

    @Before
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
        demoQaPage = new DemoQaPage(webDriver);
    }

    @After
    public void closeWebDriver() {
        Driver.closeDriver();
    }

    @Given("Open demoqa site")
    public void openDemoQa() {
        demoQaPage.openDemoQa();
    }

    @When("Select {string} in 'Colors' dropdown")
    public void selectValueInColorsDropdown(String value) {
        demoQaPage.selectValueInColorsDropdown(value);
    }

    @When("Select {string} and {string} in 'Cars' dropdown")
    public void selectValuesInCarsDropdown(String firstValue, String secondValue) {
        demoQaPage.selectValueInCarsDropdown(firstValue);
        demoQaPage.selectValueInCarsDropdown(secondValue);
    }

    @When("Select {string} in 'Groups' dropdown")
    public void selectValueInGroupsDropdown(String value) {
        demoQaPage.selectValueInGroupsDropdown(value);
    }

    @When("Select {string} in 'Titles' dropdown")
    public void selectValueInTitlesDropdown(String value) {
        demoQaPage.selectValueInTitlesDropdown(value);
    }

    @When("Select {string} and {string} in 'Multi Colors' dropdown")
    public void selectValuesInMultiColorsDropdown(String firstValue, String secondValue) {
        demoQaPage.selectMultiValuesInColorsDropdown(firstValue, secondValue);
    }

    @Then("Check 'Colors' dropdown has {string} value")
    public void checkColorsDropdownValue(String expectedValue) {
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getColorsDropdownValue());
    }

    @Then("Check 'Cars' dropdown have {string} values")
    public void checkCarsDropdownValues(String expectedValues) {
        assertEquals("Dropdown should have values:", expectedValues, demoQaPage.getCarsDropdownValues());
    }

    @Then("Check 'Groups' dropdown have {string} value")
    public void checkGroupsDropdownValue(String expectedValue) {
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getTextOfElement("(//div[contains(@class,'singleValue')])[1]"));
    }

    @Then("Check 'Titles' dropdown have {string} value")
    public void checkTitlesDropdownValue(String expectedValue) {
        assertEquals("Dropdown should have value:", expectedValue, demoQaPage.getTextOfElement("(//div[contains(@class,'singleValue')])[2]"));
    }

    @Then("Check 'Multi Colors' dropdown have {string} values")
    public void checkMultiColorsDropdownValues(String expectedValues) {
        assertEquals("Dropdown should have values:", expectedValues, demoQaPage.getMultiColorsDropdownValues("//div[contains(@class,'multiValue')]"));
    }
}

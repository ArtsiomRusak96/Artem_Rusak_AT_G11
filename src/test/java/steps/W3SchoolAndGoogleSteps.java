package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.W3SchoolsPage;

import static org.junit.Assert.assertTrue;

public class W3SchoolAndGoogleSteps {

    WebDriver webDriver;
    W3SchoolsPage w3SchoolsPage;
    GooglePage googlePage;

    @Before
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
        w3SchoolsPage = new W3SchoolsPage(webDriver);
        googlePage = new GooglePage(webDriver);
    }

    @After
    public void closeWebDriver() {
        Driver.closeDriver();
    }

    @Given("Open w3school site")
    public void openW3School() {
        w3SchoolsPage.openW3Schools();
    }

    @When("Copy word from title")
    public void copyTitleWord() {
        w3SchoolsPage.copyTitleWord();
    }

    @And("Open google site")
    public void openGoogle() {
        googlePage.openGoogle();
    }

    @And("Paste the copied word from title")
    public void pasteCopiedWord() {
        googlePage.pasteCopied();
    }

    @Then("Check all search results have pasted {string} word")
    public void checkSearchResults(String expectedWord) {
        assertTrue("All search results should contain word 'tutorial'", googlePage.checkResultContents(expectedWord));
    }
}

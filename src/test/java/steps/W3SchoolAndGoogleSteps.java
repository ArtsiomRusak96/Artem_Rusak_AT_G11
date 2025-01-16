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
import pages.GooglePage;
import pages.W3SchoolsPage;

import static org.junit.Assert.assertTrue;

public class W3SchoolAndGoogleSteps {

    private static final Logger LOGGER = LogManager.getLogger(W3SchoolAndGoogleSteps.class);

    WebDriver webDriver;
    W3SchoolsPage w3SchoolsPage;
    GooglePage googlePage;

    @Before
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        w3SchoolsPage = new W3SchoolsPage(webDriver);
        googlePage = new GooglePage(webDriver);
    }

    @After
    public void closeWebDriver() {
        LOGGER.info("Test has ended");
        Driver.closeDriver();
    }

    @Given("Open w3school site")
    public void openW3School() {
        LOGGER.debug("Opening 'w3schools.com' site");
        w3SchoolsPage.openW3Schools();
    }

    @When("Copy word from title")
    public void copyTitleWord() {
        LOGGER.debug("Copying title word");
        w3SchoolsPage.copyTitleWord();
    }

    @And("Open google site")
    public void openGoogle() {
        LOGGER.debug("Opening 'google.com' site");
        googlePage.openGoogle();
    }

    @And("Paste the copied word from title")
    public void pasteCopiedWord() {
        LOGGER.debug("Pasting the copied title word in search field");
        googlePage.pasteCopied();
    }

    @Then("Check all search results have pasted {string} word")
    public void checkSearchResults(String expectedWord) {
        LOGGER.debug("Checking search results");
        assertTrue("All search results should contain word 'tutorial'", googlePage.checkResultContents(expectedWord));
    }
}

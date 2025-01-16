package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.W3SchoolsPage;

import static org.junit.Assert.assertTrue;

public class SearchJUnitTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchJUnitTest.class);

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

    @Test
    public void searchByWordTest() {

        w3SchoolsPage.openW3Schools();
        w3SchoolsPage.copyTitleWord();

        googlePage.openGoogle();
        googlePage.pasteCopied();

        LOGGER.debug("Checking all search results content");
        assertTrue("All search results should contain word 'tutorial'", googlePage.checkResultContents("tutorial"));
    }
}

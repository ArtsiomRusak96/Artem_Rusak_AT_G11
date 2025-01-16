package tests.homework.selenium.testng;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.W3SchoolsPage;

import static org.testng.Assert.assertTrue;

public class SearchTestNgTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchTestNgTest.class);

    WebDriver webDriver;
    W3SchoolsPage w3SchoolsPage;
    GooglePage googlePage;

    @BeforeClass
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        w3SchoolsPage = new W3SchoolsPage(webDriver);
        googlePage = new GooglePage(webDriver);
    }

    @AfterClass
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
        assertTrue(googlePage.checkResultContents("tutorial"), "All search results should contain word 'tutorial'");
    }
}

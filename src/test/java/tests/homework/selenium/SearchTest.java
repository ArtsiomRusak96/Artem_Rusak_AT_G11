package tests.homework.selenium;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.W3SchoolsPage;

import static org.junit.Assert.assertTrue;

public class SearchTest {

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

    @Test
    public void searchByWordTest() {

        w3SchoolsPage.openW3Schools();
        w3SchoolsPage.copyTitleWord();

        googlePage.openGoogle();
        googlePage.pasteCopied();

        assertTrue("All search results should contain word 'tutorial'", googlePage.checkResultContents("tutorial"));
    }
}

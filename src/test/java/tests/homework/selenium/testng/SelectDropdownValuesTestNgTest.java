package tests.homework.selenium.testng;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DemoQaPage;

import static org.testng.Assert.assertEquals;

public class SelectDropdownValuesTestNgTest {

    private static final Logger LOGGER = LogManager.getLogger(SelectDropdownValuesTestNgTest.class);

    WebDriver webDriver;
    DemoQaPage demoQaPage;

    @BeforeClass
    public void launchWebDriver() {
        LOGGER.info("Test has started");
        webDriver = Driver.getDriver();
        demoQaPage = new DemoQaPage(webDriver);
    }

    @AfterClass
    public void closeWebDriver() {
        LOGGER.info("Test has ended");
        Driver.closeDriver();
    }

    @Test
    public void selectValuesTest() {

        demoQaPage.openDemoQa();

        demoQaPage.selectValueInColorsDropdown("8");
        LOGGER.debug("Checking 'Colors' dropdown value");
        assertEquals(demoQaPage.getColorsDropdownValue(), "Indigo", "Dropdown should have value:");

        demoQaPage.selectValueInCarsDropdown("opel");
        demoQaPage.selectValueInCarsDropdown("saab");
        LOGGER.debug("Checking 'Cars' dropdown values");
        assertEquals(demoQaPage.getCarsDropdownValues(), "Saab, Opel", "Dropdown should have values:");

        demoQaPage.selectValueInGroupsDropdown("Group 2, option 1");
        LOGGER.debug("Checking 'Groups' dropdown value");
        assertEquals(demoQaPage.getGroupsDropdownValue(), "Group 2, option 1", "Dropdown should have value:");

        demoQaPage.selectValueInTitlesDropdown("Prof.");
        LOGGER.debug("Checking 'Titles' dropdown value");
        assertEquals(demoQaPage.getTitlesDropdownValue(), "Prof.", "Dropdown should have value:");

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        LOGGER.debug("Checking 'Multi Colors' dropdown values");
        assertEquals(demoQaPage.getMultiColorsDropdownValues(), "Green, Blue", "Dropdown should have values:");
    }
}

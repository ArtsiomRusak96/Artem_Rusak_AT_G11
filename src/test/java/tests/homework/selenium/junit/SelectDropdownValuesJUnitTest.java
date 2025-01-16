package tests.homework.selenium.junit;

import driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.DemoQaPage;

import static org.junit.Assert.assertEquals;

public class SelectDropdownValuesJUnitTest {

    private static final Logger LOGGER = LogManager.getLogger(SelectDropdownValuesJUnitTest.class);

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

    @Test
    public void selectValuesTest() {

        demoQaPage.openDemoQa();

        demoQaPage.selectValueInColorsDropdown("8");
        LOGGER.debug("Checking 'Colors' dropdown value");
        assertEquals("Dropdown should have value:", "Indigo", demoQaPage.getColorsDropdownValue());

        demoQaPage.selectValueInCarsDropdown("opel");
        demoQaPage.selectValueInCarsDropdown("saab");
        LOGGER.debug("Checking 'Cars' dropdown values");
        assertEquals("Dropdown should have values:", "Saab, Opel", demoQaPage.getCarsDropdownValues());

        demoQaPage.selectValueInGroupsDropdown("Group 2, option 1");
        LOGGER.debug("Checking 'Groups' dropdown value");
        assertEquals("Dropdown should have value:", "Group 2, option 1", demoQaPage.getGroupsDropdownValue());

        demoQaPage.selectValueInTitlesDropdown("Prof.");
        LOGGER.debug("Checking 'Titles' dropdown value");
        assertEquals("Dropdown should have value:", "Prof.", demoQaPage.getTitlesDropdownValue());

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        LOGGER.debug("Checking 'Multi Colors' dropdown values");
        assertEquals("Dropdown should have values:", "Green, Blue", demoQaPage.getMultiColorsDropdownValues());
    }
}

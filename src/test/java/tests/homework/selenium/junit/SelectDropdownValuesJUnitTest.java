package tests.homework.selenium.junit;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.DemoQaPage;

import static org.junit.Assert.assertEquals;

public class SelectDropdownValuesJUnitTest {

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

    @Test
    public void selectValuesTest() {

        demoQaPage.openDemoQa();

        demoQaPage.selectValueInColorsDropdown("8");
        assertEquals("Dropdown should have value:", "Indigo", demoQaPage.getColorsDropdownValue());

        demoQaPage.selectValueInCarsDropdown("opel");
        demoQaPage.selectValueInCarsDropdown("saab");
        assertEquals("Dropdown should have values:", "Saab, Opel", demoQaPage.getCarsDropdownValues());

        demoQaPage.selectValueInGroupsDropdown("Group 2, option 1");
        assertEquals("Dropdown should have value:", "Group 2, option 1", demoQaPage.getGroupsDropdownValue());

        demoQaPage.selectValueInTitlesDropdown("Prof.");
        assertEquals("Dropdown should have value:", "Prof.", demoQaPage.getTitlesDropdownValue());

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        assertEquals("Dropdown should have values:", "Green, Blue", demoQaPage.getMultiColorsDropdownValues());
    }
}

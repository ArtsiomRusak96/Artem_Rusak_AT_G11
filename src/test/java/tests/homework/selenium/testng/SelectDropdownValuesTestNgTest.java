package tests.homework.selenium.testng;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DemoQaPage;

import static org.testng.Assert.assertEquals;

public class SelectDropdownValuesTestNgTest {

    WebDriver webDriver;
    DemoQaPage demoQaPage;

    @BeforeClass
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
        demoQaPage = new DemoQaPage(webDriver);
    }

    @AfterClass
    public void closeWebDriver() {
        Driver.closeDriver();
    }

    @Test
    public void selectValuesTest() {

        demoQaPage.openDemoQa();

        demoQaPage.selectValueInColorsDropdown("8");
        assertEquals(demoQaPage.getColorsDropdownValue(), "Indigo", "Dropdown should have value:");

        demoQaPage.selectValueInCarsDropdown("opel");
        demoQaPage.selectValueInCarsDropdown("saab");
        assertEquals(demoQaPage.getCarsDropdownValues(), "Saab, Opel", "Dropdown should have values:");

        demoQaPage.selectValueInGroupsDropdown("Group 2, option 1");
        assertEquals(demoQaPage.getGroupsDropdownValue(), "Group 2, option 1", "Dropdown should have value:");

        demoQaPage.selectValueInTitlesDropdown("Prof.");
        assertEquals(demoQaPage.getTitlesDropdownValue(), "Prof.", "Dropdown should have value:");

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        assertEquals(demoQaPage.getMultiColorsDropdownValues(), "Green, Blue", "Dropdown should have values:");
    }
}

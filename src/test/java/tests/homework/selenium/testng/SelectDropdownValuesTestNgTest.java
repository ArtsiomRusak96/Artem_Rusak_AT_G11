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

        String valueLocator = "(//div[contains(@class,'singleValue')])";
        demoQaPage.selectValueInGroupsDropdown("//div[@id='withOptGroup']//div[contains(text(),'Group 2, option 1')]");
        assertEquals(demoQaPage.getTextOfElement(valueLocator + "[1]"), "Group 2, option 1", "Dropdown should have value:");

        demoQaPage.selectValueInTitlesDropdown("//div[@id='selectOne']//div[contains(text(),'Prof.')]");
        assertEquals(demoQaPage.getTextOfElement(valueLocator + "[2]"), "Prof.", "Dropdown should have value:");

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        assertEquals(demoQaPage.getMultiColorsDropdownValues("//div[contains(@class,'multiValue')]"), "Green, Blue", "Dropdown should have values:");
    }
}

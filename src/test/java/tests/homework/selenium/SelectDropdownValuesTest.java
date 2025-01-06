package tests.homework.selenium;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.DemoQaPage;

import static org.junit.Assert.assertEquals;

public class SelectDropdownValuesTest {

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

        demoQaPage.selectValueInGroupsDropdown("//div[@id='withOptGroup']//div[contains(text(),'Group 2, option 1')]");
        assertEquals("Dropdown should have value:", "Group 2, option 1", demoQaPage.getTextOfElement("(//div[contains(@class,'singleValue')])[1]"));

        demoQaPage.selectValueInTitlesDropdown("//div[@id='selectOne']//div[contains(text(),'Prof.')]");
        assertEquals("Dropdown should have value:", "Prof.", demoQaPage.getTextOfElement("(//div[contains(@class,'singleValue')])[2]"));

        demoQaPage.selectMultiValuesInColorsDropdown("Green", "Blue");
        assertEquals("Dropdown should have values:", "Green, Blue", demoQaPage.getMultiColorsDropdownValues("//div[contains(@class,'multiValue')]"));
    }
}

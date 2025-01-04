package tests.homework;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SelectDropdownValuesTest {

    WebDriver webDriver;

    @Before
    public void launchWebDriver() {
        webDriver = Driver.getDriver();
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void selectValuesTest() {

        webDriver.get("https://demoqa.com/select-menu");

        WebElement colorsDropdown = findElementById("oldSelectMenu");
        Select selectColor = new Select(colorsDropdown);
        selectColor.selectByValue("8");

        assertEquals("Dropdown should have value:", "Indigo", selectColor.getFirstSelectedOption().getText());

        WebElement carsDropdown = findElementById("cars");
        Select selectCar = new Select(carsDropdown);
        selectCar.selectByValue("opel");
        selectCar.selectByValue("saab");

        assertEquals("Dropdown should have values:", "Saab, Opel", selectCar.getAllSelectedOptions()
                .stream().map(WebElement::getText).collect(Collectors.joining(", ")));

        clickElementById("withOptGroup");
        clickElementByXpath("//div[@id='withOptGroup']//div[contains(text(),'Group 2, option 1')]");

        assertEquals("Dropdown should have value:", "Group 2, option 1", getElementText("(//div[contains(@class,'singleValue')])[1]"));

        clickElementById("selectOne");
        clickElementByXpath("//div[@id='selectOne']//div[contains(text(),'Prof.')]");

        assertEquals("Dropdown should have value:", "Prof.", getElementText("(//div[contains(@class,'singleValue')])[2]"));

        clickElementByXpath("(//div[contains(@class,'placeholder')])[1]");
        clickElementByXpath("//div[contains(text(),'Green')]");
        clickElementByXpath("//div[contains(text(),'Blue')]");

        assertEquals("Dropdown should have values:", "Green, Blue", webDriver.findElements(By.xpath("//div[contains(@class,'multiValue')]"))
                .stream().map(WebElement::getText).collect(Collectors.joining(", ")));
    }

    private WebElement findElementById(String id) {
        return webDriver.findElement(By.id(id));
    }

    private void clickElementById(String id) {
        WebElement element = webDriver.findElement(By.id(id));
        element.click();
    }

    private void clickElementByXpath(String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        element.click();
    }

    private String getElementText(String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        return element.getText();
    }
}

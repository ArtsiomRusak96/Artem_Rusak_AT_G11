package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.stream.Collectors;

public class DemoQaPage {

    private static final Logger LOGGER = LogManager.getLogger(DemoQaPage.class);

    private final WebDriver webDriver;

    public DemoQaPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String DEMO_QA_SITE = "https://demoqa.com/select-menu";
    private static final String COLORS_DROPDOWN = "oldSelectMenu";
    private static final String CARS_DROPDOWN = "cars";
    private static final String GROUPS_DROPDOWN = "withOptGroup";
    private static final String TITLES_DROPDOWN = "selectOne";
    private static final String MULTI_COLORS_DROPDOWN = "(//div[contains(@class,'placeholder')])[1]";
    private static final String GROUPS_DROPDOWN_VALUES = "//div[@id='withOptGroup']//div[contains(text(),'";
    private static final String TITLES_DROPDOWN_VALUES = "//div[@id='selectOne']//div[contains(text(),'";
    private static final String MULTI_COLORS_DROPDOWN_VALUES = "//div[contains(text(),'";
    private static final String GROUPS_DROPDOWN_SELECTED_VALUE = "(//div[contains(@class,'singleValue')])[1]";
    private static final String TITLES_DROPDOWN_SELECTED_VALUE = "(//div[contains(@class,'singleValue')])[2]";
    private static final String MULTI_COLORS_DROPDOWN_SELECTED_VALUE = "//div[contains(@class,'multiValue')]";

    public void openDemoQa() {
        LOGGER.trace("Opening DemoQA site: '{}'", DEMO_QA_SITE);
        webDriver.get(DEMO_QA_SITE);
    }

    private void selectValue(String id, String value) {
        Select selectColor = new Select(findElement(By.id(id)));
        selectColor.selectByValue(value);
    }

    public void selectValueInColorsDropdown(String value) {
        LOGGER.trace("Selecting value '{}' in 'Colors' dropdown: '{}'", value, COLORS_DROPDOWN);
        selectValue(COLORS_DROPDOWN, value);
    }

    public void selectValueInCarsDropdown(String value) {
        LOGGER.trace("Selecting value '{}' in 'Cars' dropdown: '{}'", value, CARS_DROPDOWN);
        selectValue(CARS_DROPDOWN, value);
    }

    public String getColorsDropdownValue() {
        LOGGER.trace("Getting 'Colors' dropdown value: '{}'", COLORS_DROPDOWN);
        return new Select(findElement(By.id(COLORS_DROPDOWN))).getFirstSelectedOption().getText();
    }

    public String getCarsDropdownValues() {
        LOGGER.trace("Getting 'Cars' dropdown values: '{}'", CARS_DROPDOWN);
        return new Select(findElement(By.id(CARS_DROPDOWN))).getAllSelectedOptions()
                .stream().map(WebElement::getText).collect(Collectors.joining(", "));
    }

    private void selectValuesInDropdowns(String id, String xpath) {
        LOGGER.trace("Clicking on dropdown: '{}'", id);
        findElement(By.id(id)).click();
        LOGGER.trace("Selecting value in dropdown: '{}'", xpath);
        findElement(By.xpath(xpath)).click();
    }

    public void selectValueInGroupsDropdown(String value) {
        LOGGER.trace("Selecting '{}' in 'Groups' dropdown", value);
        selectValuesInDropdowns(GROUPS_DROPDOWN, GROUPS_DROPDOWN_VALUES + value + "')]");
    }

    public void selectValueInTitlesDropdown(String value) {
        LOGGER.trace("Selecting '{}' in 'Titles' dropdown", value);
        selectValuesInDropdowns(TITLES_DROPDOWN, TITLES_DROPDOWN_VALUES + value + "')]");
    }

    public void selectMultiValuesInColorsDropdown(String... colors) {
        LOGGER.trace("Clicking on 'Multi Colors' dropdown: '{}'", MULTI_COLORS_DROPDOWN);
        findElement(By.xpath(MULTI_COLORS_DROPDOWN)).click();
        for (String color : colors) {
            LOGGER.trace("Selecting '{}' in 'Multi Colors' dropdown", color);
            findElement(By.xpath(MULTI_COLORS_DROPDOWN_VALUES + color + "')]")).click();
        }
    }

    public String getGroupsDropdownValue() {
        LOGGER.trace("Getting 'Groups' dropdown value: '{}'", GROUPS_DROPDOWN_SELECTED_VALUE);
        return getTextOfElement(GROUPS_DROPDOWN_SELECTED_VALUE);
    }

    public String getTitlesDropdownValue() {
        LOGGER.trace("Getting 'Titles' dropdown value: '{}'", TITLES_DROPDOWN_SELECTED_VALUE);
        return getTextOfElement(TITLES_DROPDOWN_SELECTED_VALUE);
    }

    public String getMultiColorsDropdownValues() {
        LOGGER.trace("Getting 'Multi Colors' dropdown values: '{}'", MULTI_COLORS_DROPDOWN_SELECTED_VALUE);
        return webDriver.findElements(By.xpath(MULTI_COLORS_DROPDOWN_SELECTED_VALUE))
                .stream().map(WebElement::getText).collect(Collectors.joining(", "));
    }

    private String getTextOfElement(String xpath) {
        return findElement(By.xpath(xpath)).getText();
    }

    private WebElement findElement(By by) {
        return webDriver.findElement(by);
    }
}

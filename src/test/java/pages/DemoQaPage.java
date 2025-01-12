package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.stream.Collectors;

public class DemoQaPage {

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
        webDriver.get(DEMO_QA_SITE);
    }

    private void selectValue(String id, String value) {
        Select selectColor = new Select(findElement(By.id(id)));
        selectColor.selectByValue(value);
    }

    public void selectValueInColorsDropdown(String value) {
        selectValue(COLORS_DROPDOWN, value);
    }

    public void selectValueInCarsDropdown(String value) {
        selectValue(CARS_DROPDOWN, value);
    }

    public String getColorsDropdownValue() {
        return new Select(findElement(By.id(COLORS_DROPDOWN))).getFirstSelectedOption().getText();
    }

    public String getCarsDropdownValues() {
        return new Select(findElement(By.id(CARS_DROPDOWN))).getAllSelectedOptions()
                .stream().map(WebElement::getText).collect(Collectors.joining(", "));
    }

    private void selectValuesInDropdowns(String id, String xpath) {
        findElement(By.id(id)).click();
        findElement(By.xpath(xpath)).click();
    }

    public void selectValueInGroupsDropdown(String value) {
        selectValuesInDropdowns(GROUPS_DROPDOWN, GROUPS_DROPDOWN_VALUES + value + "')]");
    }

    public void selectValueInTitlesDropdown(String value) {
        selectValuesInDropdowns(TITLES_DROPDOWN, TITLES_DROPDOWN_VALUES + value + "')]");
    }

    public void selectMultiValuesInColorsDropdown(String... colors) {
        findElement(By.xpath(MULTI_COLORS_DROPDOWN)).click();
        for (String color : colors) {
            findElement(By.xpath(MULTI_COLORS_DROPDOWN_VALUES + color + "')]")).click();
        }
    }

    public String getGroupsDropdownValue() {
        return getTextOfElement(GROUPS_DROPDOWN_SELECTED_VALUE);
    }

    public String getTitlesDropdownValue() {
        return getTextOfElement(TITLES_DROPDOWN_SELECTED_VALUE);
    }

    public String getMultiColorsDropdownValues() {
        return webDriver.findElements(By.xpath(MULTI_COLORS_DROPDOWN_SELECTED_VALUE))
                .stream().map(WebElement::getText).collect(Collectors.joining(", "));
    }

    public String getTextOfElement(String xpath) {
        return findElement(By.xpath(xpath)).getText();
    }

    private WebElement findElement(By by) {
        return webDriver.findElement(by);
    }
}

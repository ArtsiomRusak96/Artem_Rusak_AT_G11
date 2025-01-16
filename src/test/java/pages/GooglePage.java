package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GooglePage {

    private static final Logger LOGGER = LogManager.getLogger(GooglePage.class);

    private final WebDriver webDriver;

    public GooglePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String GOOGLE_SITE = "https://google.com/";
    private static final String SEARCH_FIELD = "q";
    private static final String SEARCH_RESULT_TITLES = "div[data-snhf='0'] h3";

    public void openGoogle() {
        LOGGER.trace("Opening Google site: '{}'", GOOGLE_SITE);
        webDriver.get(GOOGLE_SITE);
    }

    public void pasteCopied() {
        Actions action = new Actions(webDriver);
        LOGGER.trace("Clicking on 'Search' field: '{}'", SEARCH_FIELD);
        webDriver.findElement(By.name(SEARCH_FIELD)).click();
        LOGGER.trace("Pasting the copied data to 'Search' field: '{}'", SEARCH_FIELD);
        action.keyDown(Keys.SHIFT)
                .sendKeys("\"")
                .keyUp(Keys.SHIFT)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.SHIFT)
                .sendKeys("\"")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
        LOGGER.trace("Clicking 'ENTER' keyboard button");
        action.keyDown(Keys.ENTER).build().perform();
    }

    public boolean checkResultContents(String expectedWord) {
        LOGGER.trace("Waiting for search results to appear: '{}'", SEARCH_RESULT_TITLES);
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(SEARCH_RESULT_TITLES)));
        LOGGER.trace("Checking the search result contents: '{}'", SEARCH_RESULT_TITLES);
        List<WebElement> resultTitles = webDriver.findElements(By.cssSelector(SEARCH_RESULT_TITLES));
        return resultTitles.stream()
                .map(WebElement::getText)
                .map(String::toLowerCase)
                .allMatch(text -> text.contains(expectedWord));
    }
}

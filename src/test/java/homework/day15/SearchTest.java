package homework.day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchTest {

    WebDriver webDriver;

    @Before
    public void launchWebDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void searchByWordTest() {

        webDriver.get("https://w3schools.com/java/");
        WebElement titleWord = webDriver.findElement(By.cssSelector("span.color_h1"));

        Actions action = new Actions(webDriver);
        action.doubleClick(titleWord)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();

        webDriver.get("https://google.com/");
        webDriver.findElement(By.name("q")).click();
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

        action.keyDown(Keys.ENTER).build().perform();

        String headResult = "div[data-snhf='0'] h3";
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(headResult)));

        List<WebElement> webElements = webDriver.findElements(By.cssSelector(headResult));
        boolean isEachResultContainWord = webElements.stream()
                .map(WebElement::getText)
                .map(String::toLowerCase)
                .allMatch(text -> text.contains("tutorial"));

        assertTrue("All search results contain word 'tutorial'", isEachResultContainWord);
    }
}

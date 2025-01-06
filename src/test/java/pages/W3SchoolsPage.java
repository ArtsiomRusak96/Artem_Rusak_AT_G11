package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class W3SchoolsPage {

    private final WebDriver webDriver;

    public W3SchoolsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String W3SCHOOLS_SITE = "https://w3schools.com/java/";
    private static final String TITLE_WORD = "span.color_h1";

    public void openW3Schools() {
        webDriver.get(W3SCHOOLS_SITE);
    }

    public void copyTitleWord() {
        new Actions(webDriver).doubleClick(webDriver.findElement(By.cssSelector(TITLE_WORD)))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }
}

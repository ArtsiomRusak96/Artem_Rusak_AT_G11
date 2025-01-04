package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;
import java.util.Optional;

public class Driver {

    public enum Config {
        CHROME, FF, EDGE
    }

    protected static Config config = Optional.ofNullable(System.getProperty("CONFIG")).isEmpty() ?
            Config.CHROME : Config.valueOf(System.getProperty("CONFIG"));

    public static WebDriver getDriver() {
        return getWebDriver();
    }

    private static WebDriver getWebDriver() {
        return switch (config) {
            case FF -> getFireFoxDriver();
            case EDGE -> getEdgeDriver();
            default -> getChromeDriver();
        };
    }

    private static WebDriver getFireFoxDriver() {
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver() {
        return new EdgeDriver();
    }

    public static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        return new ChromeDriver(options);
    }
}

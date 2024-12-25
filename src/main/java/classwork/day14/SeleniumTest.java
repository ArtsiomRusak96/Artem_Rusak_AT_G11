package classwork.day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTest {

    public static void main(String[] args) throws MalformedURLException {

//        WebDriver driver1 = new ChromeDriver();
//
//        driver1.get("https://selenium.dev");

        WebDriver driver2 = new RemoteWebDriver(new URL("http://localhost:60748"), new ChromeOptions());
        driver2.get("https://selenium.dev");
    }
}

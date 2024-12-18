package classwork.day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.quit();
    }
}

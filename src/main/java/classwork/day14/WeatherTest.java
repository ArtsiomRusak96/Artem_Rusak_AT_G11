package classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");
        WebElement searchField = webDriver.findElement(By.name("q"));
        searchField.sendKeys("погода минск");
        Thread.sleep(2000);
        WebElement clickOption = webDriver.findElement(By.xpath("(//*[@role='option'])[1]"));
        clickOption.click();
    }
}

package classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WeatherTest {

    public static void main(String[] args) {

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DayOfWeek dayOfWeek = tomorrow.getDayOfWeek();
        String nextDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("ru"));

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com/");
        WebElement searchField = webDriver.findElement(By.name("q"));
        searchField.sendKeys("погода минск");

        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul[role='listbox'] li:first-of-type"))).click();

        WebElement tomorrowDay = webDriver.findElement(By.cssSelector("div[data-wob-di='1']"));
        tomorrowDay.click();

        WebElement tomorrowTemperatureAtTwelvePM = webDriver
                .findElement(By.xpath("//*[contains(@aria-label,'Celsius " + nextDay + " 12:00')][2]"));
        System.out.println(tomorrowTemperatureAtTwelvePM.getDomAttribute("aria-label"));

        webDriver.quit();
    }
}

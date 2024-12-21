package classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")));
        driver.findElement(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Paris");
        driver.findElement(By.xpath("//*[@data-testid='searchbox-dates-container']")).click();
        driver.findElement(By.xpath("//*[@data-date='2024-12-24']")).click();
        driver.findElement(By.xpath("//*[@data-date='2024-12-31']")).click();
        driver.findElement(By.xpath("//*[@data-testid='occupancy-config']")).click();

        WebElement plusPerson = driver.findElement(By.xpath("//*[@tabindex='-1'][2]"));
        plusPerson.click();
        plusPerson.click();

        driver.findElement(By.xpath("//*[@id='no_rooms']/following-sibling::div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='5 звезд: 48 вариантов жилья']")));
        driver.findElement(By.xpath("//*[@aria-label='5 звезд: 48 вариантов жилья']")).click();



    }
}

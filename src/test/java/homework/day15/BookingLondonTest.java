package homework.day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class BookingLondonTest {

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
    public void bookingLondonTest() {

        LocalDate startDate = LocalDate.now().plusDays(3);
        LocalDate endDate = startDate.plusDays(5);

        webDriver.get("https://www.booking.com/");
        closePopup();

        findElement("//*[@name='ss']").sendKeys("London");
        clickElement("//*[@data-testid='searchbox-dates-container']");
        clickElement("//*[@data-date='" + startDate + "']");
        clickElement("//*[@data-date='" + endDate + "']");
        clickElement("//*[@type='submit']");

        closePopup();
        WebElement hotel = findElement("//div[@data-testid='property-card'][10]");
        WebElement hotelTitle = findElement("//div[@data-testid='property-card'][10]//div[@data-testid='title']");
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = 'green'", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = 'red'", hotelTitle);

        byte[] asFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        Path screenshotPath = Paths.get("picture.png");
        try {
            Files.write(screenshotPath, asFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertTrue("Screenshot should be taken", Files.exists(screenshotPath));
    }

    private WebElement findElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }

    private void clickElement(String xpath) {
        findElement(xpath).click();
    }

    private void closePopup() {
        try {
            new WebDriverWait(webDriver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Скрыть меню входа в аккаунт.']"))).click();
        } catch (Exception ignored) {
        }
    }
}

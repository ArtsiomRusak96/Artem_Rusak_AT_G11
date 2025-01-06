package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPage {

        private static final String START_DATE_XPATH = "//td[@data-date='%s']";
        private static final String ADULTS_UP_XPATH = "//button[@aria-label='Increase number of Adults']/span";
        private static final String GUESTS_TOGGLE_CSS = "#xp__guests__toggle";

        WebDriver driver;

        public DemoPage(WebDriver driver){
            this.driver = driver;
        }

        public void fakeDemoMethod(String startDate, String endDate) {
            driver.findElement(By.xpath(String.format(START_DATE_XPATH, startDate))).click();
            driver.findElement(By.xpath(String.format(START_DATE_XPATH, endDate))).click();
            driver.findElement(By.cssSelector(GUESTS_TOGGLE_CSS)).click();
            driver.findElement(By.xpath(ADULTS_UP_XPATH)).click();
            driver.findElement(By.xpath(ADULTS_UP_XPATH)).click();
        }

        public void findCity(String cityName) {
            WebElement city = driver.findElement(By.id("ss"));
            city.clear();
            city.sendKeys(cityName);
        }

    }


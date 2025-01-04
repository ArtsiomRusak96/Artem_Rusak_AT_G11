package pages.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

public class BookingPage {

    private final WebDriver webDriver;

    public BookingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String CLOSE_GENIUS_POPUP = "//*[@aria-label='Скрыть меню входа в аккаунт.']";
    private static final String SEARCH_DESTINATION = "//*[@name='ss']";
    private static final String DATES_BOX = "//*[@data-testid='searchbox-dates-container']";
    private static final String PERSONS_BOX = "//*[@data-testid='occupancy-config']";
    private static final String ADD_PERSON_PLUS = "//*[@id='group_adults']/following-sibling::div[2]/button[2]";
    private static final String ADD_ROOM_PLUS = "//*[@id='no_rooms']/following-sibling::div[2]/button[2]";
    private static final String SEARCH_BUTTON = "//*[@type='submit']";
    private static final String CURRENCY = "//button[@data-testid='header-currency-picker-trigger']";
    private static final String LANGUAGE = "//button[@data-testid='header-language-picker-trigger']";
    private static final String FIVE_STARS_FILTER = "(//input[contains(@aria-label,'5 звезд')]/following-sibling::label/span[2])[1]";
    private static final String SORTING_DROPDOWN = "//button[@data-testid='sorters-dropdown-trigger']";
    private static final String RATE_ASCENDING = "//button[@aria-label='Оценка объекта (по возрастанию)']";

    public void openBooking() {
        webDriver.get("https://www.booking.com/");
    }

    public void closePopup() {
        try {
            wait(CLOSE_GENIUS_POPUP).click();
        } catch (Exception ignored) {
        }
    }

    public void searchCity(String city) {
        webDriver.findElement(By.xpath(SEARCH_DESTINATION)).sendKeys(city);
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        click(DATES_BOX);
        click("//*[@data-date='" + startDate + "']");
        click("//*[@data-date='" + endDate + "']");
    }

    public void addPersons(int quantity) {
        click(PERSONS_BOX);
        for (int i = 0; i < quantity; i++) {
            click(ADD_PERSON_PLUS);
        }
    }

    public void addRooms(int quantity) {
        for (int i = 0; i < quantity; i++) {
            click(ADD_ROOM_PLUS);
        }
    }

    public void search() {
        click(SEARCH_BUTTON);
    }

    public void hoverOnCurrency() {
        new Actions(webDriver).moveToElement(webDriver.findElement(By.xpath(CURRENCY))).perform();
    }

    public void hoverOnLanguage() {
        new Actions(webDriver).moveToElement(webDriver.findElement(By.xpath(LANGUAGE))).perform();
    }

    private WebElement wait(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    private void click(String xpath) {
        webDriver.findElement(By.xpath(xpath)).click();
    }
}

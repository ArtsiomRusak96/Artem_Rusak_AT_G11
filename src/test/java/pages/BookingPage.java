package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;

public class BookingPage {

    private final WebDriver webDriver;

    public BookingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String BOOKING_SITE = "https://www.booking.com/";
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
    private static final String NINE_PLUS_RATE_FILTER = "(//input[@name='review_score=90']/following-sibling::label/span[2])[1]";
    private static final String SORTING_DROPDOWN = "//button[@data-testid='sorters-dropdown-trigger']";
    private static final String RATE_ASCENDING = "//button[@aria-label='Оценка объекта (по возрастанию)']";
    private static final String HOTEL_RESULTS = "(//div[@data-testid='property-card-container'])";
    private static final String HOTEL_TITLE = "//div[@data-testid='title']";
    private static final String FIRST_HOTEL_IN_LIST = "//div[@data-testid='property-card'][1]//div[@data-testid='title']";

    public void openBooking() {
        webDriver.get(BOOKING_SITE);
    }

    public void closePopup() {
        try {
            wait(CLOSE_GENIUS_POPUP).click();
        } catch (Exception ignored) {
        }
    }

    public void searchCity(String city) {
        findElement(SEARCH_DESTINATION).sendKeys(city);
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        findElement(DATES_BOX).click();
        findElement("//*[@data-date='" + startDate + "']").click();
        findElement("//*[@data-date='" + endDate + "']").click();
    }

    public void addPersons(int quantity) {
        findElement(PERSONS_BOX).click();
        for (int i = 0; i < quantity; i++) {
            findElement(ADD_PERSON_PLUS).click();
        }
    }

    public void addRooms(int quantity) {
        for (int i = 0; i < quantity; i++) {
            findElement(ADD_ROOM_PLUS).click();
        }
    }

    public void search() {
        findElement(SEARCH_BUTTON).click();
    }

    private void filter(String xpath) {
        wait(xpath).click();
    }

    public void filterByFiveStars() {
        filter(FIVE_STARS_FILTER);
    }

    public void filterByRateNinePlus() {
        filter(NINE_PLUS_RATE_FILTER);
    }

    public void sortByAscending() {
        findElement(SORTING_DROPDOWN).click();
        wait(FIRST_HOTEL_IN_LIST);
        findElement(RATE_ASCENDING).click();
    }

    private void hoverOnElement(String xpath) {
        new Actions(webDriver).moveToElement(webDriver.findElement(By.xpath(xpath))).perform();
    }

    public void hoverOnCurrency() {
        hoverOnElement(CURRENCY);
    }

    public void hoverOnLanguage() {
        hoverOnElement(LANGUAGE);
    }

    public void openFirstHotel() {
        wait(FIRST_HOTEL_IN_LIST).click();
    }

    public String getTextOfElement(String xpath) {
        return wait(xpath).getText();
    }

    public void changeBackgroundAndTitleColors(String hotelNumber, String backgroundColor, String titleColor) {
        WebElement hotel = findElement(HOTEL_RESULTS + "[" + hotelNumber + "]");
        WebElement hotelTitle = findElement(HOTEL_RESULTS + "[" + hotelNumber + "]" + HOTEL_TITLE);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = '" + backgroundColor + "'", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = '" + titleColor + "'", hotelTitle);
    }

    public Path takeScreenshot(String fileName) {
        byte[] asFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        Path screenshotPath = Paths.get(fileName);
        try {
            Files.write(screenshotPath, asFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return screenshotPath;
    }

    private WebElement findElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }

    public WebElement wait(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}

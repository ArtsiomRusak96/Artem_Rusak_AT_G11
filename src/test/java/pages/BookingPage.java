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
import java.util.ArrayList;
import java.util.List;

public class BookingPage {

    private final WebDriver webDriver;

    public BookingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static final String BOOKING_SITE = "https://www.booking.com/";
    private static final String CLOSE_GENIUS_POPUP = "//*[@aria-label='Скрыть меню входа в аккаунт.']";
    private static final String SEARCH_DESTINATION = "//*[@name='ss']";
    private static final String DATES_BOX = "//*[@data-testid='searchbox-dates-container']";
    private static final String DATES = "//*[@data-date='";
    private static final String PERSONS_BOX = "//*[@data-testid='occupancy-config']";
    private static final String ADD_PERSON_PLUS = "//*[@id='group_adults']/following-sibling::div[2]/button[2]";
    private static final String ADD_ROOM_PLUS = "//*[@id='no_rooms']/following-sibling::div[2]/button[2]";
    private static final String SEARCH_BUTTON = "//*[@type='submit']";
    private static final String CURRENCY = "//button[@data-testid='header-currency-picker-trigger']";
    private static final String CURRENCY_TOOLTIP = "//div[contains(@style,'left: 525px')]";
    private static final String LANGUAGE = "//button[@data-testid='header-language-picker-trigger']";
    private static final String LANGUAGE_TOOLTIP = "//div[contains(@style,'left: 592px')]";
    private static final String FIRST_HOTEL_STARS = "(//div[@data-testid='rating-stars'])[1]/span";
    private static final String HOTEL_RATE = "(//div[contains(text(),'Оценка')])[3]";
    private static final String FIVE_STARS_FILTER = "(//input[contains(@aria-label,'5 звезд')]/following-sibling::label/span[2])[1]";
    private static final String NINE_PLUS_RATE_FILTER = "(//input[@name='review_score=90']/following-sibling::label/span[2])[1]";
    private static final String SORTING_DROPDOWN = "//button[@data-testid='sorters-dropdown-trigger']";
    private static final String RATE_ASCENDING = "//button[@aria-label='Оценка объекта (по возрастанию)']";
    private static final String HOTELS_RESULT = "//div[@data-testid='property-card']";
    private static final String HOTELS_TITLE = "//div[@data-testid='title']";
    private static final String HOTELS_HEART = "//button[@data-testid='wishlist-button']";
    private static final String MY_NEXT_TRIPS = "//div[@data-testid='wishlist-popover-content']//span/span";
    private static final String HOTELS_IN_MY_NEXT_TRIPS_LIST = "(//div[@data-testid='closable-property-card-wrap-outer'])";
    private static final String HOTELS_TITLE_IN_MY_NEXT_TRIPS_LIST = "//h3";
    private static final String RGB_RED_COLOR = "rgba(212, 17, 30, 1)";

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
        findElement(DATES + startDate + "']").click();
        findElement(DATES + endDate + "']").click();
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
        wait(HOTELS_RESULT);
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

    public String getCurrencyTooltipText() {
        return getTextOfElement(CURRENCY_TOOLTIP);
    }

    public String getLanguageTooltipText() {
        return getTextOfElement(LANGUAGE_TOOLTIP);
    }

    public int checkStarsQuantityFirstHotel() {
        wait(FIRST_HOTEL_STARS);
        return findElements(FIRST_HOTEL_STARS).size();
    }

    public double checkHotelRate() {
        return Double.parseDouble(getTextOfElement(HOTEL_RATE)
                .replaceAll("[^0-9,]", "")
                .replaceAll(",", "."));
    }

    public void openFirstHotel() {
        wait(HOTELS_RESULT + "[1]" + HOTELS_TITLE).click();
    }

    public void addToFavoriteFirstHotel() {
        wait(HOTELS_RESULT + "[1]" + HOTELS_HEART).click();
    }

    public void addToFavoriteLastHotel() throws InterruptedException {
        int previousQuantityHotels = 0;
        while (true) {
            int currentQuantityHotels = findElements(HOTELS_RESULT).size();
            if (currentQuantityHotels == previousQuantityHotels) {
                break;
            }
            previousQuantityHotels = currentQuantityHotels;
            new Actions(webDriver).moveToElement(findElement(HOTELS_RESULT + "[last()]")).perform();
            try {
                new WebDriverWait(webDriver, Duration.ofSeconds(5))
                        .until(driver -> findElements(HOTELS_RESULT).size() > currentQuantityHotels);
            } catch (TimeoutException e) {
                System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
            }
        }
        new Actions(webDriver)
                .moveToElement(findElement(HOTELS_RESULT + "[last()]" + HOTELS_HEART))
                .click()
                .perform();
    }

    public void openMyNextTrips() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", wait(MY_NEXT_TRIPS));
        webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1));
    }

    public String getFirstHotelName() {
        return getTextOfElement(HOTELS_RESULT + "[1]" + HOTELS_TITLE);
    }

    public String getLastHotelName() {
        return getTextOfElement(HOTELS_RESULT + "[last()]" + HOTELS_TITLE);
    }

    public String getHotelNameInMyNextTripsList(int hotelNumber) {
        return getTextOfElement(HOTELS_IN_MY_NEXT_TRIPS_LIST + "[" + hotelNumber + "]" + HOTELS_TITLE_IN_MY_NEXT_TRIPS_LIST);
    }

    public String getTextOfElement(String xpath) {
        return wait(xpath).getText();
    }

    public void changeBackgroundAndTitleColors(String hotelNumber, String backgroundColor, String titleColor) {
        WebElement hotel = findElement(HOTELS_RESULT + "[" + hotelNumber + "]");
        WebElement hotelTitle = findElement(HOTELS_RESULT + "[" + hotelNumber + "]" + HOTELS_TITLE);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = '" + backgroundColor + "'", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = '" + titleColor + "'", hotelTitle);
    }

    private boolean isHotelHeartRed(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(driver -> RGB_RED_COLOR.equals(findElement(xpath).getCssValue("color")));
    }

    public boolean isFirstHotelHeartRed() {
        return isHotelHeartRed(HOTELS_RESULT + "[1]" + HOTELS_HEART);
    }

    public boolean isLastHotelHeartRed() {
        return isHotelHeartRed(HOTELS_RESULT + "[last()]" + HOTELS_HEART);
    }

    public int checkHotelsQuantityInMyNextTripsList() {
        wait(HOTELS_IN_MY_NEXT_TRIPS_LIST);
        return findElements(HOTELS_IN_MY_NEXT_TRIPS_LIST).size();
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

    public WebElement findElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }

    private List<WebElement> findElements(String xpath) {
        return webDriver.findElements(By.xpath(xpath));
    }

    private WebElement wait(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}

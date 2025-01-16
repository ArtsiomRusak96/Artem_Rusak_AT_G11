package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger LOGGER = LogManager.getLogger(BookingPage.class);

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
    private static final String CURRENCY_TOOLTIP = "//div[contains(@style,'left: 525px')]";
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

    public static final String BOOKING_LOGO = "//div[@class='Header_logo']";
    public static final String CURRENCY = "//button[@data-testid='header-currency-picker-trigger']";
    public static final String LANGUAGE = "//button[@data-testid='header-language-picker-trigger']";
    public static final String HELP_CENTER = "//a[@data-testid='header-help-center']";
    public static final String REGISTRATION_PROPERTY = "//a[@data-testid='header-custom-action-button']";
    public static final String REGISTRATION_ACCOUNT = "//a[@data-testid='header-sign-up-button']";
    public static final String SIGN_IN = "//a[@data-testid='header-sign-in-button']";

    public void openBooking() {
        LOGGER.trace("Opening Booking site: '{}'", BOOKING_SITE);
        webDriver.get(BOOKING_SITE);
    }

    public void closePopup() {
        try {
            LOGGER.trace("Closing the appeared 'Genius' pop-up: '{}'", CLOSE_GENIUS_POPUP);
            wait(CLOSE_GENIUS_POPUP).click();
        } catch (Exception ignored) {
            LOGGER.trace("'Genius' pop-up didn't appear: '{}'", CLOSE_GENIUS_POPUP);
        }
    }

    public boolean isHeaderExist(String xpath) {
        try {
            LOGGER.trace("Checking if header exists: '{}'", xpath);
            return wait(xpath).isDisplayed();
        } catch (NoSuchElementException e) {
            LOGGER.trace("Header doesn't exist: '{}'", xpath);
            return false;
        }
    }

    public void searchCity(String city) {
        LOGGER.trace("Entering '{}' in destination field: '{}'", city, SEARCH_DESTINATION);
        findElement(SEARCH_DESTINATION).sendKeys(city);
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        LOGGER.trace("Clicking on 'Dates' box: '{}'", DATES_BOX);
        findElement(DATES_BOX).click();
        LOGGER.trace("Setting start date: '{}'", DATES + startDate + "']");
        findElement(DATES + startDate + "']").click();
        LOGGER.trace("Setting end date: '{}'", DATES + endDate + "']");
        findElement(DATES + endDate + "']").click();
    }

    public void addPersons(int quantity) {
        LOGGER.trace("Clicking on 'Persons' box: '{}'", PERSONS_BOX);
        findElement(PERSONS_BOX).click();
        for (int i = 0; i < quantity; i++) {
            LOGGER.trace("Clicking on '+' button for adding persons: '{}'", ADD_PERSON_PLUS);
            findElement(ADD_PERSON_PLUS).click();
        }
    }

    public void addRooms(int quantity) {
        for (int i = 0; i < quantity; i++) {
            LOGGER.trace("Clicking on '+' button for adding rooms: '{}'", ADD_ROOM_PLUS);
            findElement(ADD_ROOM_PLUS).click();
        }
    }

    public void search() {
        LOGGER.trace("Clicking on 'Search' button: '{}'", SEARCH_BUTTON);
        findElement(SEARCH_BUTTON).click();
    }

    private void filter(String xpath) {
        wait(xpath).click();
    }

    public void filterByFiveStars() {
        LOGGER.trace("Filtering by 5-stars: '{}'", FIVE_STARS_FILTER);
        filter(FIVE_STARS_FILTER);
    }

    public void filterByRateNinePlus() {
        LOGGER.trace("Filtering by 9+ rate: '{}'", NINE_PLUS_RATE_FILTER);
        filter(NINE_PLUS_RATE_FILTER);
    }

    public void sortByAscending() {
        LOGGER.trace("Clicking on sorting dropdown: '{}'", SORTING_DROPDOWN);
        findElement(SORTING_DROPDOWN).click();
        LOGGER.trace("Waiting for hotels to appear: '{}'", HOTELS_RESULT);
        wait(HOTELS_RESULT);
        LOGGER.trace("Sorting hotels by ascending: '{}'", RATE_ASCENDING);
        findElement(RATE_ASCENDING).click();
    }

    public void hoverOnElement(String xpath) {
        LOGGER.trace("Hovering on element: '{}'", xpath);
        new Actions(webDriver).moveToElement(findElement(xpath)).perform();
    }

    public String getCurrencyTooltipText() {
        LOGGER.trace("Getting the text of currency tooltip: '{}'", CURRENCY_TOOLTIP);
        return getTextOfElement(CURRENCY_TOOLTIP);
    }

    public String getLanguageTooltipText() {
        LOGGER.trace("Getting the text of language tooltip: '{}'", LANGUAGE_TOOLTIP);
        return getTextOfElement(LANGUAGE_TOOLTIP);
    }

    public int checkStarsQuantityFirstHotel() {
        LOGGER.trace("Waiting for hotel stars to appear: '{}'", FIRST_HOTEL_STARS);
        wait(FIRST_HOTEL_STARS);
        LOGGER.trace("Getting stars quantity of the first hotel: '{}'", FIRST_HOTEL_STARS);
        return findElements(FIRST_HOTEL_STARS).size();
    }

    public double checkHotelRate() {
        LOGGER.trace("Getting the hotel rate: '{}'", HOTEL_RATE);
        return Double.parseDouble(getTextOfElement(HOTEL_RATE).replaceAll("[^0-9.]", ""));
    }

    public void openFirstHotel() {
        LOGGER.trace("Clicking on the first hotel: '{}'", HOTELS_RESULT + "[1]" + HOTELS_TITLE);
        wait(HOTELS_RESULT + "[1]" + HOTELS_TITLE).click();
        LOGGER.trace("Switching to the tab with the opened hotel");
        switchToSecondTab();
    }

    public void addToFavoriteFirstHotel() {
        LOGGER.trace("Adding the first hotel to 'Favorites' list: '{}'", HOTELS_RESULT + "[1]" + HOTELS_HEART);
        wait(HOTELS_RESULT + "[1]" + HOTELS_HEART).click();
    }

    public void addToFavoriteLastHotel() throws InterruptedException {
        int previousQuantityHotels = 0;
        while (true) {
            int currentQuantityHotels = findElements(HOTELS_RESULT).size();
            LOGGER.trace("Getting current hotels quantity '{}' on the page: '{}'", currentQuantityHotels, HOTELS_RESULT);
            if (currentQuantityHotels == previousQuantityHotels) {
                LOGGER.trace("All hotels were loaded on the page");
                break;
            }
            previousQuantityHotels = currentQuantityHotels;
            LOGGER.trace("Scrolling to the current last hotel on the page: '{}'", HOTELS_RESULT + "[last()]");
            new Actions(webDriver).moveToElement(findElement(HOTELS_RESULT + "[last()]")).perform();
            try {
                LOGGER.trace("Waiting for more hotels will appear on the page: '{}'", HOTELS_RESULT);
                new WebDriverWait(webDriver, Duration.ofSeconds(5))
                        .until(driver -> findElements(HOTELS_RESULT).size() > currentQuantityHotels);
            } catch (TimeoutException e) {
                LOGGER.error("No more hotels appeared on the page. {}: {}", e.getClass().getSimpleName(), e.getMessage());
            }
        }
        LOGGER.trace("Adding the last hotel to 'Favorites' list: '{}'", HOTELS_RESULT + "[last()]" + HOTELS_HEART);
        new Actions(webDriver)
                .moveToElement(findElement(HOTELS_RESULT + "[last()]" + HOTELS_HEART))
                .click()
                .perform();
    }

    public void openMyNextTrips() {
        LOGGER.trace("Clicking on 'My next trips' button: '{}'", MY_NEXT_TRIPS);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", wait(MY_NEXT_TRIPS));
        LOGGER.trace("Switching to the tab with the opened 'My next trips' list");
        switchToSecondTab();
    }

    public String getFirstHotelName() {
        LOGGER.trace("Getting the first hotel name: '{}'", HOTELS_RESULT + "[1]" + HOTELS_TITLE);
        return getTextOfElement(HOTELS_RESULT + "[1]" + HOTELS_TITLE);
    }

    public String getLastHotelName() {
        LOGGER.trace("Getting the last hotel name: '{}'", HOTELS_RESULT + "[last()]" + HOTELS_TITLE);
        return getTextOfElement(HOTELS_RESULT + "[last()]" + HOTELS_TITLE);
    }

    public String getHotelNameInMyNextTripsList(int hotelNumber) {
        LOGGER.trace("Getting hotel name in 'My next trips' list: '{}'", HOTELS_IN_MY_NEXT_TRIPS_LIST + "[" + hotelNumber + "]" + HOTELS_TITLE_IN_MY_NEXT_TRIPS_LIST);
        return getTextOfElement(HOTELS_IN_MY_NEXT_TRIPS_LIST + "[" + hotelNumber + "]" + HOTELS_TITLE_IN_MY_NEXT_TRIPS_LIST);
    }

    private String getTextOfElement(String xpath) {
        return wait(xpath).getText();
    }

    public void changeBackgroundAndTitleColors(String hotelNumber, String backgroundColor, String titleColor) {
        WebElement hotel = findElement(HOTELS_RESULT + "[" + hotelNumber + "]");
        WebElement hotelTitle = findElement(HOTELS_RESULT + "[" + hotelNumber + "]" + HOTELS_TITLE);
        LOGGER.trace("Scrolling to the hotel: '{}'", hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true)", hotel);
        LOGGER.trace("Changing background color to '{}' for the hotel: '{}'", backgroundColor, hotel);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.backgroundColor = '" + backgroundColor + "'", hotel);
        LOGGER.trace("Changing title color to '{}' for the hotel: '{}'", titleColor, hotelTitle);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].style.color = '" + titleColor + "'", hotelTitle);
    }

    private boolean isHotelHeartRed(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(driver -> RGB_RED_COLOR.equals(findElement(xpath).getCssValue("color")));
    }

    public boolean isFirstHotelHeartRed() {
        LOGGER.trace("Checking the first hotel heart became red: '{}'", HOTELS_RESULT + "[1]" + HOTELS_HEART);
        return isHotelHeartRed(HOTELS_RESULT + "[1]" + HOTELS_HEART);
    }

    public boolean isLastHotelHeartRed() {
        LOGGER.trace("Checking the last hotel heart became red: '{}'", HOTELS_RESULT + "[last()]" + HOTELS_HEART);
        return isHotelHeartRed(HOTELS_RESULT + "[last()]" + HOTELS_HEART);
    }

    public int checkHotelsQuantityInMyNextTripsList() {
        LOGGER.trace("Waiting for hotels to appear in 'My next trips' list: '{}'", HOTELS_IN_MY_NEXT_TRIPS_LIST);
        wait(HOTELS_IN_MY_NEXT_TRIPS_LIST);
        LOGGER.trace("Getting hotels quantity in 'My next trips' list: '{}'", HOTELS_TITLE_IN_MY_NEXT_TRIPS_LIST);
        return findElements(HOTELS_IN_MY_NEXT_TRIPS_LIST).size();
    }

    public Path takeScreenshot(String fileName) {
        LOGGER.trace("Taking screenshot");
        byte[] asFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        Path screenshotPath = Paths.get(fileName);
        try {
            LOGGER.trace("Saving screenshot to: '{}'", screenshotPath.toAbsolutePath());
            Files.write(screenshotPath, asFile);
        } catch (IOException e) {
            LOGGER.trace("Failed to save screenshot to '{}': '{}'", screenshotPath.toAbsolutePath(), e.getMessage());
            throw new RuntimeException(e);
        }
        return screenshotPath;
    }

    private void switchToSecondTab() {
        webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1));
    }

    private WebElement findElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }

    private List<WebElement> findElements(String xpath) {
        return webDriver.findElements(By.xpath(xpath));
    }

    private WebElement wait(String xpath) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}

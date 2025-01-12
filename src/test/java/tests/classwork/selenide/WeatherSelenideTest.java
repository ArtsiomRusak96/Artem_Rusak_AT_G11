package tests.classwork.selenide;

import org.openqa.selenium.By;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;

public class WeatherSelenideTest {

    public static void main(String[] args) {

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DayOfWeek dayOfWeek = tomorrow.getDayOfWeek();
        String nextDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("ru"));

        open("https://google.com/");
        $(By.name("q")).sendKeys("погода минск");
        $("ul[role='listbox'] li:first-of-type").click();
        $("div[data-wob-di='1']").click();
        System.out.println($x("//*[contains(@aria-label,'Celsius " + nextDay + " 12:00')][2]").getDomAttribute("aria-label"));
    }
}

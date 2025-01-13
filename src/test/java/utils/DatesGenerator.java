package utils;

import java.time.LocalDate;

public class DatesGenerator {

    public static LocalDate generateStartDateDaysAhead(int startInDays) {
        return LocalDate.now().plusDays(startInDays);
    }

    public static LocalDate generateStartDateMonthsAhead(int startInMonths) {
        return LocalDate.now().plusMonths(startInMonths);
    }

    public static LocalDate generateEndDate(LocalDate startDate, int duration) {
        return startDate.plusDays(duration);
    }
}

package utils;

import java.time.LocalDate;

public class DatesGenerator {

    public static LocalDate generateStartDate(int startInDays) {
        return LocalDate.now().plusDays(startInDays);
    }

    public static LocalDate generateEndDate(LocalDate startDate, int duration) {
        return startDate.plusDays(duration);
    }
}

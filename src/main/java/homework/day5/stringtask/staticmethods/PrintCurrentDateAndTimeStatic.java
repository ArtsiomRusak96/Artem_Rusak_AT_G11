package homework.day5.stringtask.staticmethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentDateAndTimeStatic {

    public static void printCurrentDateAndTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Сейчас на дворе:' d MMMM, u, H 'часа' m 'минут'");
        String text = localDateTime.format(formatter);
        System.out.println(text);
    }
}

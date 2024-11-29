package homework.day5.stringtask.staticmethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GetAndPrintDateStatic {

    public static void changeDateAndTimeFormat(String currentDateAndTime) {
        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("H.mm d.LL.yyyy");
        LocalDateTime dateAndTime = LocalDateTime.parse(currentDateAndTime, formatterIn);
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("LLLL, d, yyyy H:mm", Locale.UK);
        System.out.println(dateAndTime.format(formatterOut));
    }
}

package homework.day5.stringtask.methods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GetAndPrintDate {

    public void changeDateAndTimeFormat(String currentDateAndTime) {
        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("H.mm d.LL.yyyy");
        LocalDateTime dateAndTime = LocalDateTime.parse(currentDateAndTime, formatterIn);
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("LLLL, d, yyyy H:mm", Locale.UK);
        System.out.println(dateAndTime.format(formatterOut));
    }
}

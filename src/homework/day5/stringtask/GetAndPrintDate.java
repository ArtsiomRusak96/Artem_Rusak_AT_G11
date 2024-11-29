package homework.day5.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GetAndPrintDate {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H.mm d.LL.yyyy");
        String currentDateAndTime = localDateTime.format(formatter);

        GetAndPrintDate getAndPrintDate = new GetAndPrintDate();
        getAndPrintDate.changeDateAndTimeFormat(currentDateAndTime);
    }

    public void changeDateAndTimeFormat(String currentDateAndTime) {
        DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("H.mm d.LL.yyyy");
        LocalDateTime dateAndTime = LocalDateTime.parse(currentDateAndTime, formatterIn);
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("LLLL, d, yyyy H:mm", Locale.UK);
        System.out.println(dateAndTime.format(formatterOut));
    }
}

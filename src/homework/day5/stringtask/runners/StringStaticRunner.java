package homework.day5.stringtask.runners;

import homework.day5.stringtask.staticmethods.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringStaticRunner {

    public static void main(String[] args) {

        String string = "Hello, I'm learning JAVA!";
        String stringWithDigits = "Hi I am9 611 trying to learn J7ava, HI me too JAVA:4is difficult, b1u2t we are trying 5 to learn0 J123aVa!";
        String stringWithDuplicates = "Hi I am trying to learn Java, HI me too JAVA: is difficult, but we are trying to learn JaVa!";
        String logs = """
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """;

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H.mm d.LL.yyyy");
        String currentDateAndTime = localDateTime.format(formatter);

        CountOutputDateStatic.countAndPrintDate(string);
        FindDigitsStatic.findDigits(stringWithDigits);
        GetAndPrintDateStatic.changeDateAndTimeFormat(currentDateAndTime);
        InvestigateLogsStatic.investigateLogs(logs);
        PrintColumnStatic.printInColumn(string);
        PrintCurrentDateAndTimeStatic.printCurrentDateAndTime(localDateTime);
        PrintDuplicatesStatic.printDuplicatedWords(stringWithDuplicates);
    }
}

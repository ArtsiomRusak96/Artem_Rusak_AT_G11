package homework.day5.stringtask.runners;

import homework.day5.stringtask.methods.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringObjectRunner {

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


        CountOutputDate countOutputDate = new CountOutputDate();
        FindDigits findDigits = new FindDigits();
        GetAndPrintDate getAndPrintDate = new GetAndPrintDate();
        InvestigateLogs investigateLogs = new InvestigateLogs();
        PrintColumn printColumn = new PrintColumn();
        PrintCurrentDateAndTime printCurrentDateAndTime = new PrintCurrentDateAndTime();
        PrintDuplicates printDuplicates = new PrintDuplicates();

        countOutputDate.countAndPrintDate(string);
        findDigits.findDigits(stringWithDigits);
        getAndPrintDate.changeDateAndTimeFormat(currentDateAndTime);
        investigateLogs.investigateLogs(logs);
        printColumn.printInColumn(string);
        printCurrentDateAndTime.printCurrentDateAndTime(localDateTime);
        printDuplicates.printDuplicatedWords(stringWithDuplicates);
    }
}

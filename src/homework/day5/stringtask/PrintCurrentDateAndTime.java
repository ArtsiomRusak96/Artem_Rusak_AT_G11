package homework.day5.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentDateAndTime {

    public static void main(String[] args) {

        PrintCurrentDateAndTime printCurrentDateAndTime = new PrintCurrentDateAndTime();
        printCurrentDateAndTime.printCurrentDateAndTime();
    }

    public void printCurrentDateAndTime() {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Сейчас на дворе:' d MMMM, u, H 'часа' m 'минут'");
        String text = currentDateAndTime.format(formatter);
        System.out.println(text);
    }
}

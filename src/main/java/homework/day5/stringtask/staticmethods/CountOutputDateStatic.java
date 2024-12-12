package homework.day5.stringtask.staticmethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CountOutputDateStatic {

    public static void countAndPrintDate(String text) {
        int countVowels = text.replaceAll("[^aeiouyAEIOUY]", "").length();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сгенерированная гласная дата: d MMMM");
        System.out.println(localDate.plusDays(countVowels).format(formatter));
    }
}

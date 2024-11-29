package homework.day5.stringtask.methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CountOutputDate {

    public void countAndPrintDate(String text) {
        int countVowels = text.replaceAll("[^aeiouyAEIOUY]", "").length();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сгенерированная гласная дата: d MMMM");
        System.out.println(localDate.plusDays(countVowels).format(formatter));
    }
}

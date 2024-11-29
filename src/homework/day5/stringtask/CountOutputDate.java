package homework.day5.stringtask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CountOutputDate {

    public static void main(String[] args) {

        String text = "Hello, I'm learning JAVA!";

        CountOutputDate countOutputDate = new CountOutputDate();
        countOutputDate.countAndPrintDate(text);
    }

    public void countAndPrintDate(String text) {
        int countVowels = text.replaceAll("[^aeiouyAEIOUY]", "").length();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сгенерированная гласная дата: d MMMM");
        System.out.println(localDate.plusDays(countVowels).format(formatter));
    }
}

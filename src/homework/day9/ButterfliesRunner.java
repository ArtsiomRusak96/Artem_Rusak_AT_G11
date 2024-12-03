package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream().map(butterfly -> "\"" + butterfly + "\"")
                .filter(butterfly -> butterfly.contains("a") && butterfly.contains("o"))
                .forEach(System.out::println);
    }
}

package homework.day9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementsRunner {

    public static void main(String[] args) {

        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        elements.flatMap(string -> IntStream.range(0, string.split("[ -]").length)
                        .mapToObj(i -> (i % 2 == 0)
                                ? string.split("[ -]")[i].replaceAll("e", "o")
                                : String.valueOf(string.split("[ -]")[i].length())))
                .distinct()
                .forEach(System.out::println);
    }
}

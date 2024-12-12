package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {

    public static void main(String[] args) {

        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        numbersMod.filter(number -> String.valueOf(number).contains("3"))
                .flatMap(number -> String.valueOf(number).chars().mapToObj(digit -> switch (digit) {
                    case '0' -> "zero";
                    case '1' -> "one";
                    case '2' -> "two";
                    case '3' -> "three";
                    case '4' -> "four";
                    case '5' -> "five";
                    case '6' -> "six";
                    case '7' -> "seven";
                    case '8' -> "eight";
                    case '9' -> "nine";
                    default -> "";
                })).distinct().sorted((Comparator.reverseOrder())).forEach(System.out::println);
    }
}

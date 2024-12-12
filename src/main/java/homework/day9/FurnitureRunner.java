package homework.day9;

import homework.day7.objects.Bubble;
import homework.day7.objects.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureRunner {

    public static void main(String[] args) {

        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        );

        Random random = new Random();

        try (BufferedWriter out = new BufferedWriter(new FileWriter("bubble.txt"))) {
            furniture.filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                    .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth).reversed())
                    .map(chair -> new Chair(chair.getHeight() / 2, chair.getWidth() * random.nextInt(3, 9)))
                    .map(chair -> chair.getHeight() * chair.getWidth())
                    .max(Integer::compareTo)
                    .map(maxValue -> new Bubble(maxValue, String.valueOf(maxValue).chars().mapToObj(digit -> switch (digit) {
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
                    }).collect(Collectors.joining(" "))))
                    .ifPresent(bubble -> {
                        try {
                            out.write(bubble.toString());
                        } catch (IOException e) {
                            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}

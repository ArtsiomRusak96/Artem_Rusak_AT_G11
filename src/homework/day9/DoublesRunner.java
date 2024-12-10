package homework.day9;

import homework.day7.objects.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {

    public static void main(String[] args) {

        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        Random random = new Random();

        System.out.println(doubles.map(Math::round)
                .mapToInt(intNumber -> random.nextInt(0, Math.toIntExact(intNumber)))
                .distinct()
                .flatMap(newNumber -> IntStream.range(0, newNumber)
                        .mapToObj(bubble -> new Bubble(newNumber, "Bubble vol-" + newNumber))
                        .peek(System.out::println)
                        .mapToInt(Bubble::getVolume))
                .sum());
    }
}

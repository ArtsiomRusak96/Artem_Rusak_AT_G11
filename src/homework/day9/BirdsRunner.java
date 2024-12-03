package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(birds.stream()
                        .map(bird -> bird.replaceAll("о", "а"))
                        .collect(Collectors.joining()).toLowerCase()
                        .replaceAll("ь", "")
                        .split("б")).map(bird -> "--" + bird + "--")
                        .forEach(System.out::println);
    }
}

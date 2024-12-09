package homework.day9;

import homework.day7.objects.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {

        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный")
        );

        System.out.println(water.filter(w -> !w.getColor().equals("Прозрачная"))
                .sorted((water1, water2) -> water2.getSmell().compareTo(water1.getSmell()))
                .map(w -> new Water(w.getColor(), w.getSmell().replaceAll("ы", "ыы")))
                .map(Water::getSmell).collect(Collectors.joining()).length());
    }
}

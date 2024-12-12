package homework.day7.lists;

import homework.day7.objects.Water;

import java.util.Arrays;
import java.util.List;

public class WaterTask {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

        for (Water w : water) {
            System.out.println(w.getColor() + "-" + w.getSmell());
        }
    }
}

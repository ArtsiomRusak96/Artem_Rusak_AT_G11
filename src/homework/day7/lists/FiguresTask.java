package homework.day7.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresTask {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        for (String figure : figures) {
            System.out.print(figure);
            if (figures.indexOf(figure) < figures.size() - 1) {
                System.out.print("-");
            }
        }

        int countFiguresWithoutI = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                countFiguresWithoutI++;
            }
        }
        System.out.println("\n" + countFiguresWithoutI + " figures don't contain letter \"и\"");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();
        figures.add(2, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}

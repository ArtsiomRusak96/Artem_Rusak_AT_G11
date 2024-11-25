package homework.day7.lists;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresTask {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        try (FileWriter fileWriter = new FileWriter("figures.txt")) {
            for (String figure : figures) {
                fileWriter.write(figure);
                if (figures.indexOf(figure) < figures.size() - 1) {
                    fileWriter.write("-");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        int countFiguresWithoutI = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                countFiguresWithoutI++;
            }
        }
        System.out.println(countFiguresWithoutI + " figures don't contain letter \"и\"");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();

        try {
            figures.add(2, "Треугольник");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage() + " - Array.asList returns fixed size list, thus it doesn't allow to add/remove elements");
        }

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}

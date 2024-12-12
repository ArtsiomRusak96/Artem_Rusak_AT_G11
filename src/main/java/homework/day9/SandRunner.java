package homework.day9;

import homework.day7.objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        try (BufferedWriter out = new BufferedWriter(new FileWriter("sand_map.txt"))) {
            sandbox.stream().filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                    .sorted(Comparator.comparing(Sand::getWeight))
                    .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toUpperCase()))
                    .collect(Collectors.toMap(Sand::getWeight, Sand::getName))
                    .forEach((weight, name) -> {
                        try {
                            out.write(weight + ":" + name);
                            out.newLine();
                        } catch (IOException e) {
                            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}

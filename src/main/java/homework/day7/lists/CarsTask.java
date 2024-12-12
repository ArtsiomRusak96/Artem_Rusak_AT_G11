package homework.day7.lists;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsTask {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (FileWriter fileWriter = new FileWriter("cars.txt")) {
            for (String car : cars) {
                fileWriter.write("\"" + car + "\"" + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}

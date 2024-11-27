package homework.day7.lists;

import homework.day7.additionalobjects.Cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarsAdditionalTask {

    public static void main(String[] args) {

        List<Cars> cars = new ArrayList<>();

        cars.add(new Cars("Toyota", "Corolla"));
        cars.add(new Cars("Ford", "Mustang"));
        cars.add(new Cars("BMW", "X5"));

        for (Cars car : cars) {
            System.out.println(car.getBrand() + ":" + car.getModel());
        }

        Map<String, Cars> carsMap = new HashMap<>();

        for (int i = 0; i < cars.size(); i++) {
            carsMap.put(cars.get(i).getBrand(), cars.get(i));
        }

        for (String key : carsMap.keySet()) {
            System.out.println(key);
        }

        for (Cars values : carsMap.values()) {
            System.out.println(values);
        }

        for (Map.Entry<String, Cars> map : carsMap.entrySet()) {
            System.out.println(map);
        }
    }
}

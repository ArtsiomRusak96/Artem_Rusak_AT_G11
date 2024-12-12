package homework.day7.lists;

import homework.day7.additionalobjects.Fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsTask {

    public static void main(String[] args) {

        List<Fruits> fruits = new ArrayList<>();

        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }
        System.out.println();

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }

        Map<Integer, Fruits> fruitsMap = new HashMap<>();

        for (int i = 0; i < fruits.size(); i++) {
            fruitsMap.put(i, fruits.get(i));
        }
        System.out.println();

        for (Integer key : fruitsMap.keySet()) {
            System.out.println(key);
        }

        for (Fruits values : fruitsMap.values()) {
            System.out.println(values);
        }

        for (Map.Entry<Integer, Fruits> map : fruitsMap.entrySet()) {
            System.out.println(map);
        }
    }
}

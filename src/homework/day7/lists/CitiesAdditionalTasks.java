package homework.day7.lists;

import homework.day7.additionalobjects.Cities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitiesAdditionalTasks {

    public static void main(String[] args) {

        List<Cities> cities = new ArrayList<>();

        cities.add(new Cities("Москва", 12000000));
        cities.add(new Cities("Нью-Йорк", 8400000));
        cities.add(new Cities("Париж", 2200000));

        for (Cities city : cities) {
            System.out.print(city.getName() + " ");
        }

        System.out.println();

        for (Cities city : cities) {
            System.out.print(city.getPopulation() + " ");
        }

        Map<String, Cities> citiesMap = new HashMap<>();

        for (int i = 0; i < cities.size(); i++) {
            citiesMap.put(cities.get(i).getName(), cities.get(i));
        }
        System.out.println();

        int sumPopulation = 0;
        for (Cities population : citiesMap.values()) {
            sumPopulation += population.getPopulation();
        }
        System.out.println("The total population of all cities = " + sumPopulation);
    }
}

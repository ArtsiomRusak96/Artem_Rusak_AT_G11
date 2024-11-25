package homework.day7.lists;

import java.util.ArrayList;
import java.util.List;

public class CitiesTask {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int countLetters = 0;
        for (String city : cities) {
            countLetters += city.length();
        }
        System.out.println("The total amount of all letters in this list = " + countLetters);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}

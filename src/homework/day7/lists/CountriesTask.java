package homework.day7.lists;

import java.util.ArrayList;
import java.util.List;

public class CountriesTask {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country);
            if (countries.indexOf(country) < countries.size() - 1) {
                System.out.print(", ");
            }
        }

        int countCountries = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                countCountries++;
            }
        }
        System.out.println("\n" + countCountries + " countries with names less than 7 letters");

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}

package homework.day7.lists;

import java.util.ArrayList;
import java.util.List;

public class NoodlesTask {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.print(noodle);
            if (noodles.indexOf(noodle) < noodles.size() - 1) {
                System.out.print("-");
            }
        }

        noodles.replaceAll(noodle -> noodle.replace('a', 'o'));
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}

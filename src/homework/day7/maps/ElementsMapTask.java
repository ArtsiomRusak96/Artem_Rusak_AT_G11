package homework.day7.maps;

import java.util.HashMap;
import java.util.Map;

public class ElementsMapTask {

    public static void main(String[] args) {

        Map<Integer, String> elements = new HashMap<>();

        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        for (String element : elements.values()) {
            System.out.print(element + " ");
        }

        int count = 0;
        for (String element : elements.values()) {
            if (element.contains("u")) {
                count++;
            }
        }
        System.out.println("\n" + count + " elements have letter \"u\" in their names");

        for (Map.Entry<Integer, String> map : elements.entrySet()) {
            System.out.println(map);
        }

        elements.put(4, "Selenium");
        elements.remove(2);

        for (Map.Entry<Integer, String> map : elements.entrySet()) {
            System.out.println(map);
        }
    }
}

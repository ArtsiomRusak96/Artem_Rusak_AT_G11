package homework.day7.lists;

import java.util.ArrayList;
import java.util.List;

public class ElementsTask {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }

        int countElements = 0;
        for (String element : elements) {
            int countWords = element.split("[ -]").length;
            if (countWords > 1) {
                countElements++;
            }
        }
        System.out.println("\n" + countElements + " elements consist of more than one word");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        elements.add(4, "Spinner");

        elements.remove(1);

        elements.set(4, "Switch");
        System.out.println();

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}

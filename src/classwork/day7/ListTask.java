package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Orange");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");

        for (String i : colors) {
            System.out.println(i);
        }

        colors.add(1, "Pink");
        colors.add(3, "Yellow");

        String string = "";
        for (int i = 0; i < colors.size(); i++) {
            string += " " + colors.get(i);
        }
        System.out.println(string);

        System.out.println(colors.get(0) + " " + colors.get(4));
    }
}

package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ListsPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        String string = "мама мыла раму мыла";

        String[] newString = string.split(" ");

        for (String i : newString) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

package homework.day7.lists;

import homework.day7.objects.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureTask {

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }

        Map<Integer, Chair> chairMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }
        System.out.println();

        for (int key : chairMap.keySet()) {
            System.out.println(key);
        }

        for (Chair values : chairMap.values()) {
            System.out.println(values);
        }

        for (Map.Entry<Integer, Chair> map : chairMap.entrySet()) {
            System.out.println(map);
        }
    }
}

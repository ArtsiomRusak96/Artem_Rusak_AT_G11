package homework.day7.lists;

import homework.day7.objects.Sand;

import java.util.*;

public class SandboxTask {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }

        System.out.println();

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }

        Map<Integer, Sand> sandboxMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandboxMap.put(i, sandbox.get(i));
        }
        System.out.println();

        for (int key : sandboxMap.keySet()) {
            System.out.println(key);
        }

        for (Sand values : sandboxMap.values()) {
            System.out.println(values);
        }

        for (Map.Entry<Integer, Sand> map : sandboxMap.entrySet()) {
            System.out.println(map);
        }
    }
}

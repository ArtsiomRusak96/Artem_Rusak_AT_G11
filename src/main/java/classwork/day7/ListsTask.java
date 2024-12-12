package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTask {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            list.add(String.valueOf(i));
            list2.add(String.valueOf(i));
        }

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < list2.size(); i++) {
            list2.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}

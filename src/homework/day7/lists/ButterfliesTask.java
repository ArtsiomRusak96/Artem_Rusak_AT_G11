package homework.day7.lists;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesTask {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }

        int countButterflies = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                countButterflies++;
            }
        }
        System.out.println(countButterflies + " butterflies contain letter \"o\"");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        for (String butterfly : butterflies) {
            System.out.print("\n" + butterfly);
        }
    }
}

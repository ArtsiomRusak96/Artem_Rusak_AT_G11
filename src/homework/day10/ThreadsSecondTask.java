package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsSecondTask {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                List<Mouse> mice = new ArrayList<>();
                for (int j = 0; j < 18; j++) {
                    mice.add(new Mouse(j));
                    if (j % 2 != 0) {
                        mice.get(j).peep();
                    }
                }
            }).start();
        }
    }
}

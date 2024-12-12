package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsFirstTask {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                List<Mouse> mice = new ArrayList<>();
                for (int j = 0; j < 20; j++) {
                    mice.add(new Mouse(j));
                    mice.get(j).peep();
                }
            }).start();
        }
    }
}

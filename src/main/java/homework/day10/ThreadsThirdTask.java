package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsThirdTask {

    public static void main(String[] args) {

        new Thread(() -> {
            List<Mouse> mice = new ArrayList<>();
            for (int i = 0; i < 280; i++) {
                mice.add(new Mouse(i));
            }
            for (int i = 0; i < 5; i++) {
                new Thread(() -> {
                    while (!mice.isEmpty()) {
                        Mouse mouse;
                        synchronized (mice) {
                            if (mice.isEmpty()) {
                                break;
                            }
                            mouse = mice.removeFirst();
                        }
                        mouse.peep();
                    }
                }).start();
            }
        }).start();
    }
}

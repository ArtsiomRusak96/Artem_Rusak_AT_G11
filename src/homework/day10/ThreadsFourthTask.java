package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsFourthTask {

    public static void main(String[] args) {

        new Thread(() -> {
            List<Mouse> mice = new ArrayList<>();
            for (int i = 0; i < 380; i++) {
                mice.add(new Mouse(i));
            }
            for (int i = 0; i < 7; i++) {
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
                        try {
                            Thread.sleep(250);
                        } catch (InterruptedException e) {
                            System.out.println(e.getClass().getSimpleName() + ": " +e.getMessage());
                        }
                    }
                }).start();
            }
        }).start();
    }
}

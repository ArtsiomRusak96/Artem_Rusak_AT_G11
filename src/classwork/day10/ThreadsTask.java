package classwork.day10;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class ThreadsTask {


    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> {
//               heavyMethod();
//            }).start();
//        }

        Thread t1 = new Thread(() -> heavyMethod());
        Thread t2 = new Thread(() -> heavyMethod());
        Thread t3 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            heavyMethod();
        });
        t1.start();
        t2.start();
        t3.start();

    }

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n", Thread.currentThread().getName(), (System.currentTimeMillis() - t0));
    }
}

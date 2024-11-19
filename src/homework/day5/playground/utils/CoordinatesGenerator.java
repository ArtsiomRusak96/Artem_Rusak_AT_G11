package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        Random random = new Random();
        int i = random.nextInt(1, 80);
        System.out.printf("CoordinatesGenerator: I have generated point with value: %d\n", i);
        return i;
    }
}

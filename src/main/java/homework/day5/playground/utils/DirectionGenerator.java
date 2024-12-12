package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();
        int i = random.nextInt(1, 40);
        if (i < 10) {
            return "NORTH";
        } else if (i < 20) {
            return "SOUTH";
        } else if (i < 30) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}

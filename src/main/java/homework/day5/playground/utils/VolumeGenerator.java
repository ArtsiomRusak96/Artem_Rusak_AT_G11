package homework.day5.playground.utils;

import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {

    public static int generateVolume(Pourable pourable) {
        Random random = new Random();
        int x = 0;
        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            x = random.nextInt(1, 50);
        } else if (pourable instanceof Water) {
            x = random.nextInt(50, 100);
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %d\n", pourable.getClass().getSimpleName(), x);
        return x;
    }
}

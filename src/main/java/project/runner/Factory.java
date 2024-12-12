package project.runner;

import project.boxing.Bottle;
import project.liquids.SparklingWater;

public class Factory {

    public static void main(String[] args) throws InterruptedException {

        double bottleVolume = 0.05;
        double bottleVolume2 = 0.1;
        double bottleVolume3 = 0.2;

        int temperature = 12;
        int temperature2 = 18;
        int temperature3 = 25;

        Bottle bottle = new Bottle(bottleVolume);
        Bottle bottle2 = new Bottle(bottleVolume2);
        Bottle bottle3 = new Bottle(bottleVolume3);

        SparklingWater sparklingWater = new SparklingWater(bottleVolume, false);
        sparklingWater.setTemperature(temperature);

        SparklingWater sparklingWater2 = new SparklingWater(bottleVolume2, false);
        sparklingWater2.setTemperature(temperature2);

        SparklingWater sparklingWater3 = new SparklingWater(bottleVolume3, false);
        sparklingWater3.setTemperature(temperature3);

        bottle.setWater(sparklingWater);
        bottle2.setWater(sparklingWater2);
        bottle3.setWater(sparklingWater3);

        bottle.setBubbles();
        bottle2.setBubbles();
        bottle3.setBubbles();

        bottle.open();
        bottle2.open();
        bottle3.open();
    }
}

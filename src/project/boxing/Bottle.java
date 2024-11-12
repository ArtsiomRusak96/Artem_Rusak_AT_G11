package project.boxing;

import project.liquids.SparklingWater;

public class Bottle {

    private double volume;
    private SparklingWater sparklingWater;

    public void open() throws InterruptedException {
        sparklingWater.degas();
    }

    public Bottle(double volume) {
        this.volume = volume;
        this.sparklingWater = new SparklingWater(volume, false);
    }

    public double getVolume() {
        return volume;
    }

    public SparklingWater getSparklingWater() {
        return sparklingWater;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSparklingWater(SparklingWater sparklingWater) {
        this.sparklingWater = sparklingWater;
    }
}

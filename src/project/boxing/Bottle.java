package project.boxing;

public class Bottle {

    private double volume;
    private SparklingWater sparklingWater;

    public void open() {
        sparklingWater.degas();
    }

    public Bottle(double volume) {
        this.volume = volume;
        this.sparklingWater = new SparklingWater(volume);
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

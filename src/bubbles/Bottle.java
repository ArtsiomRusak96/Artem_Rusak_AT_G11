package bubbles;

public class Bottle {

    private double volume;
    SparklingWater sparklingWater;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void open() {
        sparklingWater.degas();
    }
}

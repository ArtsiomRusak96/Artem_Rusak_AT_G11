package project.boxing;

import project.bubbles.Bubble;
import project.liquids.SparklingWater;
import project.liquids.Water;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open() throws InterruptedException {
        System.out.printf("Opening bottle with volume %f\n", volume);
        if (water instanceof SparklingWater) {
            ((SparklingWater) water).setOpened();
        }
    }

    public void warm(int temperature) {
        System.out.printf("Warming water in bottle to %d degrees\n", temperature);
        water.setTemperature(temperature);
    }

    public double getVolume() {
        System.out.printf("Getting the volume of bottle: %f\n", volume);
        return volume;
    }

    public Water getWater() {
        System.out.println("Getting water from bottle");
        return water;
    }

    public void setVolume(double volume) {
        System.out.printf("Setting volume for bottle, %f\n", volume);
        this.volume = volume;
    }

    public void setWater(Water water) {
        System.out.printf("Setting water to bottle with volume %f\n", volume);
        this.water = water;
    }

    public void setBubbles() {
        if (water instanceof SparklingWater) {
            int bubblesCountForLiter = 10000;
            int neededBubbles = (int) (bubblesCountForLiter * volume);
            Bubble bubble = new Bubble("Gas 1");
            Bubble[] bubbles = new Bubble[neededBubbles];
            System.out.printf("Setting %d bubbles to water\n", bubbles.length);
            for (int i = 0; i < bubbles.length; i++) {
                bubbles[i] = bubble;
            }
            ((SparklingWater) water).pump(bubbles);
        }
    }
}

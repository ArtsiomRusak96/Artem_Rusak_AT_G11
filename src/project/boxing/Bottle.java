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
        if (water instanceof SparklingWater) {
            ((SparklingWater) water).setOpened();
        }
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    public double getVolume() {
        return volume;
    }

    public Water getWater() {
        return water;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {
        if (water instanceof SparklingWater) {
            int bubblesCountForLiter = 10000;
            int neededBubbles = (int) (bubblesCountForLiter * volume);
            Bubble bubble = new Bubble("Gas 1");
            Bubble[] bubbles = new Bubble[neededBubbles];
            for (int i = 0; i < bubbles.length; i++) {
                bubbles[i] = bubble;
            }
            ((SparklingWater) water).pump(bubbles);
        }
    }
}

package project.liquids;

import project.bubbles.Bubble;

public abstract class Water {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;
    private boolean isOpened;


    public Water(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getSmell() {
        return smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setOpened(boolean isOpened) throws InterruptedException {
        this.isOpened = true;
    }

    public void setBubbles(Bubble[] bubbles) {
    }
}


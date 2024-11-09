package project.liquids;

public abstract class Water {

    private String color;
    private double transparency;
    private String smell;
    private double temperature;

    public Water(String color, double transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public double getTransparency() {
        return transparency;
    }

    public String getSmell() {
        return smell;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}


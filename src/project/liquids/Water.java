package project.liquids;

public abstract class Water {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public String getColor() {
        System.out.printf("Getting the color of water: %s\n", color);
        return color;
    }

    public String getTransparency() {
        System.out.printf("Getting the transparency of water: %s\n", transparency);
        return transparency;
    }

    public String getSmell() {
        System.out.printf("Getting the smell of water: %s\n", smell);
        return smell;
    }

    public int getTemperature() {
        System.out.printf("Getting the temperature of water: %d\n", temperature);
        return temperature;
    }

    public void setColor(String color) {
        System.out.printf("Setting the color of water to: %s\n", color);
        this.color = color;
    }

    public void setTransparency(String transparency) {
        System.out.printf("Setting the transparency of water to: %s\n", transparency);
        this.transparency = transparency;
    }

    public void setSmell(String smell) {
        System.out.printf("Setting the smell of water to: %s\n", smell);
        this.smell = smell;
    }

    public void setTemperature(int temperature) {
        System.out.printf("Setting the temperature of water to: %d\n", temperature);
        this.temperature = temperature;
    }
}

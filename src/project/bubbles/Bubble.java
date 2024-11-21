package project.bubbles;

public class Bubble {

    private final double volume = 0.3;
    private String gas;


    public Bubble(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        System.out.printf("Getting the gas of bubble: %s\n", gas);
        return gas;
    }

    public double getVolume() {
        System.out.printf("Getting the volume of bubble: %f\n", volume);
        return volume;
    }

    public void setGas(String gas) {
        System.out.printf("Setting gas for bubble: %s\n", gas);
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }
}

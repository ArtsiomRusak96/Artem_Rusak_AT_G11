package project.bubbles;

public class Bubble {

    private final double volume = 0.3;
    private String gas;


    public Bubble(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        return gas;
    }

    public double getVolume() {
        return volume;
    }

    public void setGas(String gasComposition) {
        this.gas = gasComposition;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }
}

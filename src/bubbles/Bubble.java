package bubbles;

public class Bubble {

    final double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public String getGasComposition(String gasComposition) {
        return gasComposition;
    }

    public void setGasComposition() {
        this.gasComposition = gasComposition;
    }

    public void pop() {
        System.out.println("Cramp");
    }
}

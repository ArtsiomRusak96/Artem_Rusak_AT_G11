package project.liquids;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private int bubblesCountForLiter = 10000;

    public SparklingWater(double volume) {
        super("color", 0.4, "smell", 22.2);
        int neededBubbles = (int) (bubblesCountForLiter * volume);
        Bubble bubble = new Bubble("Gas");
        Bubble[] bubbles = new Bubble[neededBubbles];
        for (int i = 0; i < neededBubbles; i++) {
            bubbles[i] = bubble;
        }
//        Suggestion from IDEA:
//        Arrays.fill(bubbles, bubble);
        pump(bubbles);
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("Gas");
        }
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
//                System.out.println(i);
                bubbles[i].pop();
                bubbles[i] = null;
            }
        }
    }
}

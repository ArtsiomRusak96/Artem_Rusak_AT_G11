package project.liquids;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(double volume, boolean isOpened) {
        super("color", "transparent", "smell", 1);
        int bubblesCountForLiter = 10000;
        int neededBubbles = (int) (bubblesCountForLiter * volume);
        Bubble bubble = new Bubble("Gas");
        Bubble[] bubbles = new Bubble[neededBubbles];
        for (int i = 0; i < neededBubbles; i++) {
            bubbles[i] = bubble;
        }
//        Suggestion from IDEA:
//        Arrays.fill(bubbles, bubble);
        pump(bubbles);
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("Gas");
        }
    }

    public void setOpened(boolean isOpened) throws InterruptedException {
        this.isOpened = true;
        degas();
    }

    private void isOpened() {

    }

    public void degas() throws InterruptedException {
        int bubblesCountForRemove = 10 + 5 * getTemperature();
        int countRemoves = bubbles.length / bubblesCountForRemove;
//        System.out.println(bubblesCountForRemove);

        int removeAction = 0;
        for (int i = 1; i < countRemoves + 1; i++) {
            int x = bubblesCountForRemove + removeAction;
            for (int j = removeAction; j < x; j++) {
                if (bubbles[j] != null) {
                    bubbles[j].cramp();
                    bubbles[j] = null;
                    removeAction++;
                }
            }
            System.out.println(removeAction);
            Thread.sleep(1000);
        }
        for (int i = removeAction; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
//                System.out.println(i);
                bubbles[i].cramp();
                bubbles[i] = null;
            }
        }
    }
}

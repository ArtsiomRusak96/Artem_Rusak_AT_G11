package homework.day10;

public class Mouse {

    private String pattern;
    private String name;

    public Mouse(int number) {
        name = "Mouse <" + number + ">";
    }

    public void peep() {
        System.out.println(name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}

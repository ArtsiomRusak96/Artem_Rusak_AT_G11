package homework.day3.basetask.objects;

public class Sauce {

    private String name;
    private String color;

    public Sauce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSauceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }
}

package homework.day3.basetask.objects;

public class Pineapple {

    private String grade;
    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails() {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоёмкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасается больше :(");
        }
    }
}

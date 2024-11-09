package TestPackage;

public class Car {

    int maxSpeed;

    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void setSpeed(int newSpeed) {
        this.maxSpeed = newSpeed;
    }

    public void showSpeed() {
        System.out.println(this.maxSpeed);
    }
}

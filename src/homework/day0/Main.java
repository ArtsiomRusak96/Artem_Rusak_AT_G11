package testpack;

public class Main {

    public static void main(String[] args) {

        Human person1;
        person1 = new Human();
        person1.name = "Artem";
        person1.surname = "Rusak";
        person1.age = 28;
        person1.isMale = true;
        person1.nationality = "Belarus";

        Human person2;
        person2 = new Human();

        person2.name = "Viktoria";
        person2.surname = "Ivanova";
        person2.age = 42;
        person2.isMale = false;
        person2.nationality = "Belarus";

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);


        Car myCar = new Car();
        int carNormalSpeed = 70;
        myCar.maxSpeed = 180;
        myCar.startEngine();
        myCar.setSpeed(90);
        myCar.setSpeed(carNormalSpeed);
        myCar.showSpeed();
        myCar.setSpeed(140);
        myCar.showSpeed();

    }
}
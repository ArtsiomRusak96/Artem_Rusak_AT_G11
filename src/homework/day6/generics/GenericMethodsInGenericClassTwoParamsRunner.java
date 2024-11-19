package homework.day6.generics;

import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> stringStringGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Copter> airplaneCopterGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> rocketAutomobileGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> mopedMotorbikeGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCanGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Beetle> mugBeetleGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrotChamomileGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> crocodileFlyGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> maylilyMosquitoGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> pigeonPotatoGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRavenGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Diesel> roseDieselGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Petrol, Water> petrolWaterGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();

        String string = "Hello Generics";
        String string2 = "Java";
        String string3 = "Automation";
        int x = 12345;
        int y = 777;
        double z = 67890.54321;

        System.out.println(stringStringGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string));
        System.out.println(stringStringGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string, string2));
        stringStringGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, string2);
        stringStringGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, string);
        stringStringGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, string2, string3);

        System.out.println(stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string));
        System.out.println(stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string, x));
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, string2);
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, y);
        stringIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, x, string3);

        System.out.println(stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string));
        System.out.println(stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(string, z));
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, string2);
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, z);
        stringDoubleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(string, z, string3);

        System.out.println(integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(x));
        System.out.println(integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(x, y));
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, string);
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, y);
        integerIntegerGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, y, string3);

        Plane plane = new Plane(5000, "Boeing-787");
        Copter copter = new Copter(1500, "Military copter");
        System.out.println(airplaneCopterGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(plane));
        System.out.println(airplaneCopterGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(plane, copter));
        airplaneCopterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(plane, string);
        airplaneCopterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, copter);
        airplaneCopterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(plane, copter, string3);

        Rocket rocket = new Rocket(15000, "Space-X");
        Car car = new Car(3000, "BMW");
        System.out.println(rocketAutomobileGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rocket));
        System.out.println(rocketAutomobileGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rocket, car));
        rocketAutomobileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rocket, string);
        rocketAutomobileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, car);
        rocketAutomobileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rocket, car, string3);

        Moped moped = new Moped(700, "Yamaha");
        Motorbike motorbike = new Motorbike(1450, "Suzuki");
        System.out.println(mopedMotorbikeGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(moped));
        System.out.println(mopedMotorbikeGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(moped, motorbike));
        mopedMotorbikeGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(moped, string);
        mopedMotorbikeGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, motorbike);
        mopedMotorbikeGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(moped, motorbike, string3);

        Bottle bottle = new Bottle(250, "Pepsi");
        Can can = new Can(1000, "Juice");
        System.out.println(bottleCanGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(bottle));
        System.out.println(bottleCanGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(bottle, can));
        bottleCanGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(bottle, string);
        bottleCanGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, can);
        bottleCanGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(bottle, can, string3);

        Mug mug = new Mug(125, "Tea");
        Beetle beetle = new Beetle(50, "May beetle");
        System.out.println(mugBeetleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mug));
        System.out.println(mugBeetleGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(mug, beetle));
        mugBeetleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mug, string);
        mugBeetleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, beetle);
        mugBeetleGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(mug, beetle, string3);

        Carrot carrot = new Carrot(80, "Orange carrot");
        Chamomile chamomile = new Chamomile(5, "Small chamomile");
        System.out.println(carrotChamomileGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(carrot));
        System.out.println(carrotChamomileGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(carrot, chamomile));
        carrotChamomileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(carrot, string);
        carrotChamomileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, chamomile);
        carrotChamomileGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(carrot, chamomile, string3);

        Crocodile crocodile = new Crocodile(1435, "Gena");
        Fly fly = new Fly(2, "Fly CC");
        System.out.println(crocodileFlyGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(crocodile));
        System.out.println(crocodileFlyGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(crocodile, fly));
        crocodileFlyGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(crocodile, string);
        crocodileFlyGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, fly);
        crocodileFlyGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(crocodile, fly, string3);

        Maylily maylily = new Maylily(6, "Pink maylily");
        Mosquito mosquito = new Mosquito(2, "Forest mosquito");
        System.out.println(maylilyMosquitoGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(maylily));
        System.out.println(maylilyMosquitoGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(maylily, mosquito));
        maylilyMosquitoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(maylily, string);
        maylilyMosquitoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, mosquito);
        maylilyMosquitoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(maylily, mosquito, string3);

        Pigeon pigeon = new Pigeon(150, "City pigeon");
        Potato potato = new Potato(90, "Baby potato");
        System.out.println(pigeonPotatoGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(pigeon));
        System.out.println(pigeonPotatoGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(pigeon, potato));
        pigeonPotatoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(pigeon, string);
        pigeonPotatoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, potato);
        pigeonPotatoGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(pigeon, potato, string3);

        Radish radish = new Radish(43, "Sweet radish");
        Raven raven = new Raven(147, "Black raven");
        System.out.println(radishRavenGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(radish));
        System.out.println(radishRavenGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(radish, raven));
        radishRavenGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(radish, string);
        radishRavenGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, raven);
        radishRavenGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(radish, raven, string3);

        Rose rose = new Rose(11, "White rose");
        Diesel diesel = new Diesel();
        System.out.println(roseDieselGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rose));
        System.out.println(roseDieselGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(rose, diesel));
        roseDieselGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rose, string);
        roseDieselGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, diesel);
        roseDieselGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(rose, diesel, string3);

        Petrol petrol = new Petrol();
        Water water = new Water();
        System.out.println(petrolWaterGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(petrol));
        System.out.println(petrolWaterGenericMethodsInGenericClassTwoParams.genericMethodGenArgs(petrol, water));
        petrolWaterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(petrol, string);
        petrolWaterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(x, water);
        petrolWaterGenericMethodsInGenericClassTwoParams.genericMethodHalfGenArgs(petrol, water, string3);
    }
}

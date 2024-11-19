package homework.day6.generics;


import homework.day5.playground.essence.craft.air.Airplane;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Automobile;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Airplane> airplaneGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Automobile> automobileGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();

        String string = "Hello Generics!";
        String string2 = "Java";
        stringGenericMethodsInGenericClassT.genericMethodOneGenArg(string);
        System.out.println(stringGenericMethodsInGenericClassT.genericMethodTwoGenArgs(string, string2));
        stringGenericMethodsInGenericClassT.genericMethodHalfGenArgs(string, string2);

        int x = 42;
        int y = 1234567890;
        integerGenericMethodsInGenericClassT.genericMethodOneGenArg(x);
        System.out.println(integerGenericMethodsInGenericClassT.genericMethodTwoGenArgs(x, y));
        integerGenericMethodsInGenericClassT.genericMethodHalfGenArgs(x, string2);

        double z = 123.456;
        double w = 789.54321;
        doubleGenericMethodsInGenericClassT.genericMethodOneGenArg(z);
        System.out.println(doubleGenericMethodsInGenericClassT.genericMethodTwoGenArgs(z, w));
        doubleGenericMethodsInGenericClassT.genericMethodHalfGenArgs(z, string2);

        Airplane airplane = new Airplane(5000, "Boeing-787");
        Airplane airplane2 = new Airplane(4000, "Boeing-777");
        airplaneGenericMethodsInGenericClassT.genericMethodOneGenArg(airplane);
        System.out.println(airplaneGenericMethodsInGenericClassT.genericMethodTwoGenArgs(airplane, airplane2));
        airplaneGenericMethodsInGenericClassT.genericMethodHalfGenArgs(airplane, string2);

        Copter copter = new Copter(1500, "Military copter");
        Copter copter2 = new Copter(1500, "Civil copter");
        copterGenericMethodsInGenericClassT.genericMethodOneGenArg(copter);
        System.out.println(copterGenericMethodsInGenericClassT.genericMethodTwoGenArgs(copter, copter2));
        copterGenericMethodsInGenericClassT.genericMethodHalfGenArgs(copter, string2);

        Rocket rocket = new Rocket(15000, "Space-X");
        Rocket rocket2 = new Rocket(18000, "Space-Y");
        rocketGenericMethodsInGenericClassT.genericMethodOneGenArg(rocket);
        System.out.println(rocketGenericMethodsInGenericClassT.genericMethodTwoGenArgs(rocket, rocket2));
        rocketGenericMethodsInGenericClassT.genericMethodHalfGenArgs(rocket, string2);

        Automobile automobile = new Automobile(3000, "BMW");
        Automobile automobile2 = new Automobile(3800, "Audi");
        automobileGenericMethodsInGenericClassT.genericMethodOneGenArg(automobile);
        System.out.println(automobileGenericMethodsInGenericClassT.genericMethodTwoGenArgs(automobile, automobile2));
        automobileGenericMethodsInGenericClassT.genericMethodHalfGenArgs(automobile, string2);

        Moped moped = new Moped(700, "Yamaha");
        Moped moped2 = new Moped(600, "Honda");
        mopedGenericMethodsInGenericClassT.genericMethodOneGenArg(moped);
        System.out.println(mopedGenericMethodsInGenericClassT.genericMethodTwoGenArgs(moped, moped2));
        mopedGenericMethodsInGenericClassT.genericMethodHalfGenArgs(moped, string2);

        Motorbike motorbike = new Motorbike(1450, "Suzuki");
        Motorbike motorbike2 = new Motorbike(1780, "Kawasaki");
        motorbikeGenericMethodsInGenericClassT.genericMethodOneGenArg(motorbike);
        System.out.println(motorbikeGenericMethodsInGenericClassT.genericMethodTwoGenArgs(motorbike, motorbike2));
        motorbikeGenericMethodsInGenericClassT.genericMethodHalfGenArgs(motorbike, string2);

        Bottle bottle = new Bottle(250, "Pepsi");
        Bottle bottle2 = new Bottle(500, "Sprite");
        bottleGenericMethodsInGenericClassT.genericMethodOneGenArg(bottle);
        System.out.println(bottleGenericMethodsInGenericClassT.genericMethodTwoGenArgs(bottle, bottle2));
        bottleGenericMethodsInGenericClassT.genericMethodHalfGenArgs(bottle, string2);

        Can can = new Can(1000, "Juice");
        Can can2 = new Can(1500, "Dry fruits");
        canGenericMethodsInGenericClassT.genericMethodOneGenArg(can);
        System.out.println(canGenericMethodsInGenericClassT.genericMethodTwoGenArgs(can, can2));
        canGenericMethodsInGenericClassT.genericMethodHalfGenArgs(can, string2);

        Mug mug = new Mug(125, "Tea");
        Mug mug2 = new Mug(125, "Coffee");
        mugGenericMethodsInGenericClassT.genericMethodOneGenArg(mug);
        System.out.println(mugGenericMethodsInGenericClassT.genericMethodTwoGenArgs(mug, mug2));
        mugGenericMethodsInGenericClassT.genericMethodHalfGenArgs(mug, string2);

        Beetle beetle = new Beetle(50, "May beetle");
        Beetle beetle2 = new Beetle(25, "Cockroach");
        beetleGenericMethodsInGenericClassT.genericMethodOneGenArg(beetle);
        System.out.println(beetleGenericMethodsInGenericClassT.genericMethodTwoGenArgs(beetle, beetle2));
        beetleGenericMethodsInGenericClassT.genericMethodHalfGenArgs(beetle, string2);

        Carrot carrot = new Carrot(80, "Orange carrot");
        Carrot carrot2 = new Carrot(100, "Rotten carrot");
        carrotGenericMethodsInGenericClassT.genericMethodOneGenArg(carrot);
        System.out.println(carrotGenericMethodsInGenericClassT.genericMethodTwoGenArgs(carrot, carrot2));
        carrotGenericMethodsInGenericClassT.genericMethodHalfGenArgs(carrot, string2);

        Chamomile chamomile = new Chamomile(5, "Small chamomile");
        Chamomile chamomile2 = new Chamomile(10, "Big chamomile");
        chamomileGenericMethodsInGenericClassT.genericMethodOneGenArg(chamomile);
        System.out.println(chamomileGenericMethodsInGenericClassT.genericMethodTwoGenArgs(chamomile, chamomile2));
        chamomileGenericMethodsInGenericClassT.genericMethodHalfGenArgs(chamomile, string2);

        Crocodile crocodile = new Crocodile(1435, "Gena");
        Crocodile crocodile2 = new Crocodile(1700, "Wild crocodile");
        crocodileGenericMethodsInGenericClassT.genericMethodOneGenArg(crocodile);
        System.out.println(crocodileGenericMethodsInGenericClassT.genericMethodTwoGenArgs(crocodile, crocodile2));
        crocodileGenericMethodsInGenericClassT.genericMethodHalfGenArgs(crocodile, string2);

        Fly fly = new Fly(2, "Fly CC");
        Fly fly2 = new Fly(3, "Died fly");
        flyGenericMethodsInGenericClassT.genericMethodOneGenArg(fly);
        System.out.println(flyGenericMethodsInGenericClassT.genericMethodTwoGenArgs(fly, fly2));
        flyGenericMethodsInGenericClassT.genericMethodHalfGenArgs(fly, string2);

        Maylily maylily = new Maylily(6, "Pink maylily");
        Maylily maylily2 = new Maylily(7, "Red maylily");
        maylilyGenericMethodsInGenericClassT.genericMethodOneGenArg(maylily);
        System.out.println(maylilyGenericMethodsInGenericClassT.genericMethodTwoGenArgs(maylily, maylily2));
        maylilyGenericMethodsInGenericClassT.genericMethodHalfGenArgs(maylily, string2);

        Mosquito mosquito = new Mosquito(2, "Forest mosquito");
        Mosquito mosquito2 = new Mosquito(3, "Dangerous mosquito");
        mosquitoGenericMethodsInGenericClassT.genericMethodOneGenArg(mosquito);
        System.out.println(mosquitoGenericMethodsInGenericClassT.genericMethodTwoGenArgs(mosquito, mosquito2));
        mosquitoGenericMethodsInGenericClassT.genericMethodHalfGenArgs(mosquito, string2);

        Pigeon pigeon = new Pigeon(150, "City pigeon");
        Pigeon pigeon2 = new Pigeon(175, "Post pigeon");
        pigeonGenericMethodsInGenericClassT.genericMethodOneGenArg(pigeon);
        System.out.println(pigeonGenericMethodsInGenericClassT.genericMethodTwoGenArgs(pigeon, pigeon2));
        pigeonGenericMethodsInGenericClassT.genericMethodHalfGenArgs(pigeon, string2);

        Potato potato = new Potato(90, "Baby potato");
        Potato potato2 = new Potato(180, "Old potato");
        potatoGenericMethodsInGenericClassT.genericMethodOneGenArg(potato);
        System.out.println(potatoGenericMethodsInGenericClassT.genericMethodTwoGenArgs(potato, potato2));
        potatoGenericMethodsInGenericClassT.genericMethodHalfGenArgs(potato, string2);

        Radish radish = new Radish(43, "Sweet radish");
        Radish radish2 = new Radish(72, "Bitter radish");
        radishGenericMethodsInGenericClassT.genericMethodOneGenArg(radish);
        System.out.println(radishGenericMethodsInGenericClassT.genericMethodTwoGenArgs(radish, radish2));
        radishGenericMethodsInGenericClassT.genericMethodHalfGenArgs(radish, string2);

        Raven raven = new Raven(147, "Black raven");
        Raven raven2 = new Raven(178, "One-eye raven");
        ravenGenericMethodsInGenericClassT.genericMethodOneGenArg(raven);
        System.out.println(ravenGenericMethodsInGenericClassT.genericMethodTwoGenArgs(raven, raven2));
        ravenGenericMethodsInGenericClassT.genericMethodHalfGenArgs(raven, string2);

        Rose rose = new Rose(11, "White rose");
        Rose rose2 = new Rose(14, "Red rose");
        roseGenericMethodsInGenericClassT.genericMethodOneGenArg(rose);
        System.out.println(roseGenericMethodsInGenericClassT.genericMethodTwoGenArgs(rose, rose2));
        roseGenericMethodsInGenericClassT.genericMethodHalfGenArgs(rose, string2);

        Diesel diesel = new Diesel();
        Diesel diesel2 = new Diesel();
        dieselGenericMethodsInGenericClassT.genericMethodOneGenArg(diesel);
        System.out.println(dieselGenericMethodsInGenericClassT.genericMethodTwoGenArgs(diesel, diesel2));
        dieselGenericMethodsInGenericClassT.genericMethodHalfGenArgs(diesel, string2);

        Petrol petrol = new Petrol();
        Petrol petrol2 = new Petrol();
        petrolGenericMethodsInGenericClassT.genericMethodOneGenArg(petrol);
        System.out.println(petrolGenericMethodsInGenericClassT.genericMethodTwoGenArgs(petrol, petrol2));
        petrolGenericMethodsInGenericClassT.genericMethodHalfGenArgs(petrol, string2);

        Water water = new Water();
        Water water2 = new Water();
        waterGenericMethodsInGenericClassT.genericMethodOneGenArg(water);
        System.out.println(waterGenericMethodsInGenericClassT.genericMethodTwoGenArgs(water, water2));
        waterGenericMethodsInGenericClassT.genericMethodHalfGenArgs(water, string2);
    }
}

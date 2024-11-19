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

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> stringStringGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerIntegerGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Airplane, Copter> airplaneCopterGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Automobile> rocketAutomobileGenericMethodsInGenericClassTwoParams = new GenericMethodsInGenericClassTwoParams<>();
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
    }
}

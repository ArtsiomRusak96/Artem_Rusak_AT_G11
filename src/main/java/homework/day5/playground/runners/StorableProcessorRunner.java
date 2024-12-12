package homework.day5.playground.runners;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Storable;
import homework.day5.playground.essence.material.*;
import homework.day5.playground.processors.StorableProcessor;

public class StorableProcessorRunner {

    public static void main(String[] args) {

        StorableProcessor storableProcessor = new StorableProcessor();

        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
//        Container class doesn't implement Storable interface
//        storableProcessor.runStorable(containerBottle, pourableDiesel);
//        Matter class doesn't implement Storable interface. Powerable interface doesn't extend Storable interface
//        storableProcessor.runStorable(matterBottle, powerableDiesel);
//        Matter class doesn't implement Storable interface
//        storableProcessor.runStorable(can, matterPetrol);
        storableProcessor.runStorable(storableCan, water);
//        Container class doesn't implement Storable interface
//        storableProcessor.runStorable(containerCan, pourableWater);
//        Matter class doesn't implement Storable interface
//        storableProcessor.runStorable(matterCan, pourableWater);
    }
}

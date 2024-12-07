package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.material.Pourable;

public interface Storable {

    String getName();
    int getMass();

    default void store(Pourable pourable, int amount) {
        pourable.spread(getName());
        System.out.printf("I am %s, my name is %s and I received %d of %s\n", getClass().getSimpleName(), getName(), amount, pourable.getClass().getSimpleName());
        if (amount > getMass()) {
            if (this instanceof Bottle) {
                System.out.println("wooh-wooh-wooh-hh..");
            } else if (this instanceof Can) {
                System.out.println("waah-waah-waah-hh..");
            }
        }
    }
}

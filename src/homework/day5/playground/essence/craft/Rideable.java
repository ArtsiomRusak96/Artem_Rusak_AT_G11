package homework.day5.playground.essence.craft;

public interface Rideable {

    String getName();

    default void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I am driving to %s", getClass().getSimpleName(), getName(), direction);
    }
}

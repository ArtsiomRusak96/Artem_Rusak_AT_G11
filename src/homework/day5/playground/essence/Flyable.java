package homework.day5.playground.essence;

public interface Flyable {

    String getName();

    default void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I am flying to %s", getClass().getSimpleName(), getName(), direction);
    }
}

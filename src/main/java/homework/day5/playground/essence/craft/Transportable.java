package homework.day5.playground.essence.craft;

public interface Transportable {

    String getName();

    default int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", getClass().getSimpleName(), getName(), pointA, pointB);
        return pointB - pointA;
    }
}

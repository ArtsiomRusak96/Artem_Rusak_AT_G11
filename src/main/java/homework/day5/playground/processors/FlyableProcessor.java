package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        String direction = DirectionGenerator.generateDirection();
        flyable.fly(direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}

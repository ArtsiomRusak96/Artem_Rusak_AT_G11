package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;


public abstract class AirVehicle extends Matter implements Flyable, Transportable {

    protected String name;

    public AirVehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

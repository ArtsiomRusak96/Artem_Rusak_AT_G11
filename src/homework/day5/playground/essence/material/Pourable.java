package homework.day5.playground.essence.material;

public interface Pourable {

    default void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s\n", getClass().getSimpleName(), storeName);
        if (this instanceof Petrol) {
            System.out.println("wheeh..");
        } else if (this instanceof Diesel) {
            System.out.println("whooh..");
        } else if (this instanceof Water) {
            System.out.println("whobl-whobl..");
        }
    }
}

package homework.day5.playground.essence.creatures;

public interface Crawlable {

    String getName();

    default void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units\n", getClass().getSimpleName(), getName(), direction, distance);
        if (this instanceof Crocodile) {
            System.out.println("wr-wr-wrr-r..");
        } else if (this instanceof Beetle) {
            System.out.println("vz-vz-vzz-zz..");
        }
    }
}

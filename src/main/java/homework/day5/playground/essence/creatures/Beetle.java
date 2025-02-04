package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        int massComparison = home.getMass() / mass;
        if (mass < home.getMass()) {
            System.out.printf("I am %s and I will nest there with %d my family members!", name, massComparison);
        } else {
            System.out.println("This carrot is too small for nesting =(");
        }
    }

    public String toString() {
        return "Beetle{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}

package basetask;

public class Bee {

    private String gender;
    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        double weightInKilograms = (double) weight / 1000;
        double weightDifference = (double) 500 / weightInKilograms;
        System.out.println("Я легче лося в " + weightDifference + " раз");
    }
}

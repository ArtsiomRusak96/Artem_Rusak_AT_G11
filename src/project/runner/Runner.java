package project.runner;

import project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Bottle bottle = new Bottle(0.5);
        Bottle bottle2 = new Bottle(1.0);
        Bottle bottle3 = new Bottle(1.5);

        bottle.open();
        bottle2.open();
        bottle3.open();
    }
}

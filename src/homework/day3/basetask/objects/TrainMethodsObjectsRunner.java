package homework.day3.basetask.objects;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Micky", 6);
        Sauce sauce = new Sauce("Mustard", "yellow");
        Bee bee = new Bee("Male", 3);
        Obstacle obstacle = new Obstacle("Huge obstacle", "Super urgent");
        Pineapple pineapple = new Pineapple("Hawaiian", 4200.123);

        trainMethodsObjects.processMouse(mouse);
        trainMethodsObjects.processSauce(sauce);
        trainMethodsObjects.processBee(bee);
        trainMethodsObjects.processObstacle(obstacle);
        trainMethodsObjects.processPineapple(pineapple);
    }
}

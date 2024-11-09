package StudyPackage;

import java.util.Random;

public class SecondLesson {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i : array) {
            System.out.println("Value is: " + i);
        }
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Average value is: " + sum / array.length);
    }
}

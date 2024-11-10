package homework.day4;

import java.util.Random;

public class ArraysAndConsoleTask {

    public static void main(String[] args) {

        ArraysAndConsoleTask arraysAndConsoleTask = new ArraysAndConsoleTask();

        int[] array = new int[100];
        int n = 7;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        arraysAndConsoleTask.sumArrayValues(array, n);
    }

    int sum = 0;

    public void sumArrayValues(int[] array, int n) {
        for (int i = n - 1; i < array.length; i += n) {
//            System.out.println(i + " = " + array[i]);
            sum += array[i];
        }
        System.out.println(sum);
    }
}

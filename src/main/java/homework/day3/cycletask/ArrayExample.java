package homework.day3.cycletask;

import java.util.Arrays;
import java.util.Random;


public class ArrayExample {

    int[] array = new int[7];
    Random random = new Random();

    public void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayValues() {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public void printArrayValuesInReverse() {
        for (int i = array.length - 1; i > -1; i--) {
            System.out.println(array[i]);
        }
    }

    public void multiplyArrayValues() {
        for (int i : array) {
            System.out.println(i * 5);
        }
    }

    public void squareArrayValues() {
        for (int i : array) {
            System.out.println(i * i);
        }
    }

    public void findMinValue() {
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println(minValue);
    }

    public void swapArrayValues() {
        int firstValue = array[0];
        int lastValue = array[array.length - 1];
        array[0] = lastValue;
        array[array.length - 1] = firstValue;
        for (int i : array) {
            System.out.println(i);
        }
    }

    public void sortArrayValues() {
        Arrays.sort(array);
        for (int i = array.length - 1; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}

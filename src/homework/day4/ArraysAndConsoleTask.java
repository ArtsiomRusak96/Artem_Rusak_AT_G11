package homework.day4;

import java.util.Random;

public class ArraysAndConsoleTask {

    public static void main(String[] args) {

        ArraysAndConsoleTask arraysAndConsoleTask = new ArraysAndConsoleTask();

        int[] array = new int[47];
        int n = 7;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        arraysAndConsoleTask.sumArrayValues(array, n);

        int[] newArray = arraysAndConsoleTask.printArrayValuesInReverse(array, n);
        for (int i : newArray) {
            System.out.println(i);
        }

        int sum = arraysAndConsoleTask.sumArrayValuesSecond(array);
        System.out.println(sum);

    }


    public void sumArrayValues(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
//            System.out.println(i + " = " + array[i]);
            sum += array[i];
        }
        System.out.println(sum);
    }

    public int[] printArrayValuesInReverse(int[] array, int n) {
        int countElements = 0;
        for (int i : array) {
//            System.out.println(i);
            if (i > n) {
                countElements++;
            }
        }
        int[] newArray = new int[countElements];
        int j = 0;
        for (int i = array.length - 1; i > -1; i--) {
            if (array[i] > n) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public int sumArrayValuesSecond(int[] array) {
        int arrayLength = array.length;
        while (arrayLength > 9) {
            arrayLength /= 10;
        }
//        System.out.println(arrayLength);
        int sum = 0;
        for (int i : array) {
            System.out.println(i);
            if (i % arrayLength == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

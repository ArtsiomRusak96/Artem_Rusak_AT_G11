package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        System.out.println("First task with WHILE cycle:");
        WhileCycleExample whileCycleExample = new WhileCycleExample();
        whileCycleExample.trainWhileCycle();

        System.out.println("Second task with FOR cycle:");
        ForCycleExample forCycleExample = new ForCycleExample();
        forCycleExample.trainForCycle();

        System.out.println("Third task with ARRAY:");
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.fillArray();

        System.out.println("1. Print array values:");
        arrayExample.printArrayValues();

        System.out.println("2. Print array values in reverse order:");
        arrayExample.printArrayValuesInReverse();

        System.out.println("3. Multiply each array value by 5:");
        arrayExample.multiplyArrayValues();

        System.out.println("4. Square each array value:");
        arrayExample.squareArrayValues();

        System.out.println("5. Find minimal value in array:");
        arrayExample.findMinValue();

        System.out.println("6. Swap the first and the last value in array:");
        arrayExample.swapArrayValues();

        System.out.println("7. Sort array values in descending order:");
        arrayExample.sortArrayValues();
    }
}

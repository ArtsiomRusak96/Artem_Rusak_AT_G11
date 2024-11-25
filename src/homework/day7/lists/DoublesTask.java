package homework.day7.lists;

import java.util.Arrays;
import java.util.List;

public class DoublesTask {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double doubleNumber : doubles) {
            System.out.print(doubleNumber + " ");
        }

        double multiplication = 1;
        for (double doubleNumber : doubles) {
            multiplication *= doubleNumber;
        }
        System.out.println("\nMultiplication of all list elements = " + multiplication);

        double sum = 0;
        for (double doubleNumber : doubles) {
            double decimalNumber = doubleNumber - Math.floor(doubleNumber);
            sum += decimalNumber;
        }
        System.out.println(sum);

        for (int i = 0; i < doubles.size(); i++) {
            int intNumber = (int) Math.floor(doubles.get(i));
            System.out.print(intNumber + " ");
        }
    }
}

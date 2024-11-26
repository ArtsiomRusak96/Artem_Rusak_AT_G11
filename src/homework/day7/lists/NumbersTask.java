package homework.day7.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumbersTask {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all list elements = " + sum);

        numbers.sort(Comparator.naturalOrder());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        numbers.sort(Comparator.reverseOrder());
        System.out.println();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

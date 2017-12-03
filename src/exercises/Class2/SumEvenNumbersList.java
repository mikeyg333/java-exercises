package exercises.Class2;

import java.util.ArrayList;
import java.util.Arrays;

public class SumEvenNumbersList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Integer sum = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }

        System.out.println("The sum of the even numbers in the list equals " + sum);

    }
}

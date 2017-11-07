package exercises;

import java.util.ArrayList;

public class SumOfArrayList {


    public static void main(String[] args) {

        // Declare and initialize an empty ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add objects to the ArrayList
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        // Declare and init an empty variable for the sum of the ArrayList
        int listSum = 0;

        // Loop through list and add numbers to empty variable
        for (Integer number : numbers) {
            listSum += number;
        }

        System.out.println(listSum);
    }
}

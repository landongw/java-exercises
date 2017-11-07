package exercises;

import java.util.ArrayList;

public class FindWordsOfLength {

    public static void main(String[] args) {

        // Declare and initialize an empty ArrayList
        ArrayList<String> words = new ArrayList<>();
        // Add objects to the ArrayList
        words.add("fiver");
        words.add("one");
        words.add("two");
        words.add("seven");
        words.add("niner");

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}

package exercises;

import java.util.Scanner;

public class FoundInString {
    public static void main(String[] args) {
        String searchWord;

        Scanner in1;
        String searchString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        in1 = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        searchWord = in1.next();

        System.out.println(searchString.toLowerCase().contains(searchWord));

    }
}

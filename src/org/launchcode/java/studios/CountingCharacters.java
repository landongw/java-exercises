package org.launchcode.java.studios;

import java.util.HashMap;

public class CountingCharacters {

    public static String counter(String text) {

        char[] charactersInString = text.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char character : charactersInString) {
            if (counts.containsKey(character)) {
                counts.put(character, counts.get(character) + 1);  // I STUCK HERE, HOW TO UPDATE HASHMAP OR IF TO USE HASHMAP
            }
        }

        // ITERATE THROUGH EACH KEY IN COUNT HASHMAP
            // PRINT KEY AND COUNT

        return String.valueOf(counts);
    }

    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        System.out.println(counter(text));
    }
}

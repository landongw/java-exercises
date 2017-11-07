package org.launchcode.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class flowcontrol {


    public static void switchExample() {

        int a = 5;
        int b = a++;  // Why is this not 7?
        int c = ++a;

        System.out.println("a: " + a + " b: " + b + " c: " + c);

        for (int day = 1; day <= 3; day++) {  // Check out ligatures
            switch (day) { // Good for highly restricted cases (ex: up, down, left, right), also easy to make bugs
                case 3:
                    System.out.println("Three french hens.");
                case 2:
                    System.out.println("Two turtle doves.");
                case 1:
                    System.out.println("Partridge in a pear tree.");
            }
            System.out.println("");
        }
    }

    public static void doWhile() {

        int i = 0;

        do {                            // Executes at least once
            System.out.println(i);
            i += 1;
        } while (i < 10);

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        };
    }

    public static void someContainers() {

        int[] days = new int[7]; // Immutable length with mutable contents

//        String[] startValues = {"a", "b", "c"}

        ArrayList<String> daysArrayList = new ArrayList<>(Arrays.asList("Sunday", "Saturday"));
        daysArrayList.remove("Saturday");
        daysArrayList.add("Monday");
        daysArrayList.add("Tuesday");
        daysArrayList.remove(1);

        System.out.println(daysArrayList);
        System.out.println(daysArrayList.get(1));

        // HashMap (Dictionary)
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("John", 9);
        ages.put("LaunchCode", 4);
        ages.put("michael", 29);

        System.out.println(ages);
        System.out.println("Michael: " + ages.get("MICHAEL".toLowerCase()));
        System.out.println("Sharon default: " + ages.getOrDefault("sharon", 0));
        System.out.println(ages.keySet() + " " + ages.values());

    }

    public static void main(String[] args) {
        Boolean someVal = false;
        Integer myst = 5;
        if (someVal) {
            System.out.println("true");
        } else if (myst == 5 && true || false) {
            System.out.println("always true");
        } else {
            System.out.println("not true");
        }

        switchExample();

        doWhile();

        someContainers();
    }
}

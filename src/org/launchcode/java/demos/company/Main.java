package org.launchcode.java.demos.company.example.launchcode.intro;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer numbar = 2;
        long numbarb = 1234567;
        double numbarf = 1.289;
        double numbard = 0.1;
        int numbara = 4;
        double numbarsum = numbar + numbara + numbarb + numbarf + numbard;
        System.out.println(numbarsum);

        char h = 'h';
        System.out.println(h + 2);


        String hello = "Hello!";
        String world = "Hello!";
        System.out.println(hello.equals(world));

        boolean x = false;
        Integer[] my_ints = new Integer[10];
        my_ints[0] = 5;
        System.out.println(my_ints[0]);
        System.out.println(my_ints[1]);
        System.out.println(my_ints[2]);

        Integer[] your_ints = {1,2,3,4,5,6,7,8};
        System.out.println(your_ints[1]);

        System.out.println(add(your_ints[0], your_ints[1]));

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        System.out.println(value);
    }

    public static int add(int a, int b) {
        return a + b;
    }

}

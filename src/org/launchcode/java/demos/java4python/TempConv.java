package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class TempConv {
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;
        //Scanner in;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahrenheit = in.nextFloat();

        celsius = (float) ((fahrenheit - 32.0) * 5.00/9.00);
        System.out.println("The temperature in C is: " + celsius);
    }

}

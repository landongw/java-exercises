package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.14;
        float r;
        float A;

        Scanner in1;
        in1 = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        r = in1.nextFloat();

        if (r < 0) {
            System.out.println("Error: negative number not make circle.");
        } else {
            A = (float) pi * r * r;
            System.out.println("The area of the circle of radius " + r + " is " + A + ".");
        }
    }
}

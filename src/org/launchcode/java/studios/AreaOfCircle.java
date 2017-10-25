package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.14;
        float r = 0;
        float A;
        boolean rB = true;  // true means r has not been initialized

        while (rB) {
            Scanner in1;
            in1 = new Scanner(System.in);
            System.out.println("Enter the radius of the circle: ");
            r = in1.nextFloat();
            if (r < 0) {
                System.out.println("Error: negative number not make circle.");
            } else if (r == 0) {
                System.out.println("Error: zero not make circle.");
            } else {
                rB = false;
            }
        }

        A = (float) pi * r * r;
        System.out.println("The area of the circle of radius " + r + " is " + A + ".");

    }
}

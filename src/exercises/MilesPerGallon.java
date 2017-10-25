package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        float distance_driven;
        float gallons_consumed;
//        float sidec;
//        float area;
        float mpg;
        Scanner distance;
        Scanner gallons;

        distance = new Scanner(System.in);
        System.out.println("Enter the number of miles you drove: ");
        distance_driven = distance.nextFloat();

        gallons = new Scanner(System.in);
        System.out.println("Enter the number of gallons you used: ");
        gallons_consumed = gallons.nextFloat();

        mpg = (distance_driven/gallons_consumed);
        System.out.println(mpg + " MPG");
    }
}

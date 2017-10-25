package exercises;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float sidea;
        float sideb;
        float sidec;
        float area;
        float s;
        Scanner in;
        Scanner in2;
        Scanner in3;

        in = new Scanner(System.in);
        System.out.println("Enter the length of side a: ");
        sidea = in.nextFloat();

        in2 = new Scanner(System.in);
        System.out.println("Enter the length of side b: ");
        sideb = in2.nextFloat();

        in3 = new Scanner(System.in);
        System.out.println("Enter the length of side c: ");
        sidec = in3.nextFloat();

        s = (sidea + sideb + sidec)/2;
        area = (float) Math.sqrt(s * (s-sidea) * (s-sideb) * (s-sidec));
//        float h = area / 1 / 2 8 sideb
        System.out.println("The area of the triangle is: " + area);
    }
}

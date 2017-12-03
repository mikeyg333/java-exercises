package exercises.Class1;

import java.util.Scanner;

public class NumericTypesGas {
    public static void main(String [] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner in = new Scanner(System.in);

        System.out.println("How many miles have" +
                " you driven?");
        miles = in.nextDouble();

        System.out.println("How many gallons of" +
                " gas have you consumed?");
        gallons = in.nextDouble();

        mpg = miles * gallons;

        System.out.println("Your car is currently" +
                " getting " + mpg + " MPG");
    }
}

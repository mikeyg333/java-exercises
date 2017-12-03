package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");

        radius = in.nextDouble();

        if (radius <= 0) {
            System.out.println("Radius must be greater than zero. Please enter a positive value.");
        } else {
            area = 3.14 * radius * radius;
            System.out.println("The area of a circle with a radius of " + radius + " equals " + area + ".");
        }
    }
}
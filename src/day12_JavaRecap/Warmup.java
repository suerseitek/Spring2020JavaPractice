package day12_JavaRecap;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {


        /* write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter ciricle radius: ");

        double radius = input.nextDouble();

        double area = 3.1415 * radius * radius;

        System.out.println("Area of circle is: "+ area);



    }
}

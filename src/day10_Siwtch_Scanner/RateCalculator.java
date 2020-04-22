package day10_Siwtch_Scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");

        byte num1 = input.nextByte();

        System.out.println("Input second number");

        byte num2 = input.nextByte();

        System.out.println("The sum of those two numbers are: "+(num1+num2));



    }


}

package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a long number: ");

        long a = input.nextLong();

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal:");

        float b = input.nextFloat();

        System.out.println("You have entered: "+ b);

    }
}

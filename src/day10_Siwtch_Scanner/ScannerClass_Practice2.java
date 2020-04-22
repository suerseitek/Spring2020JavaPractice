package day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Practice2 {

    public static void main(String[] args) {

       /*
       write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your salary");

        int salary = input.nextInt();

        System.out.println("Please, enter how many hours do you work in a week");

        int hours = input.nextInt();

        System.out.println("Please, enter how many weeks do you work in a year?");

        int weeks = input.nextInt();

        System.out.println("Your hourly rate is "+(salary/weeks/hours)+" $ an hour");

    }
}

package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
         */

        System.out.println("Enter salary:");
        double salary = input.nextDouble();

        System.out.println("Enter full name:");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("Enter company name:");
        String company = input.nextLine();

        System.out.println("Enter SSN");
        int ssn = input.nextInt();

        input.nextLine();

        System.out.println("Enter job title:");
        String job = input.nextLine();

        System.out.println(name+" "+ssn+" "+company+" "+job+" "+salary+" $");













    }
}

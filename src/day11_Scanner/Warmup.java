package day11_Scanner;

import java.util.Scanner;
/*
1. Wash Your hands
        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
        3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */

public class Warmup {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);  // scanner object

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0 ;

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;  // 10/3.0 ==> 3.3333


        // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        // salaryAfterTax = salry - totalTax
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax: $"+totalTax);



    }


}


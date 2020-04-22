package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
        4.	write a program that can calculate the two numbers based on the user provided operators,
        the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all
						the previous steps
								(you will need a lop that has true condition without the iterator)
         */

        Scanner input = new Scanner(System.in);

        for(int i =0; i < 1;) {
            System.out.println("Enter first number:");
            int x = input.nextInt();
            System.out.println("Enter second number:");
            int y = input.nextInt();
            System.out.println("Enter math operator:");
            String operator = input.next();

            switch (operator) {
                case "+":
                    System.out.println("Addition is: " + (x + y));
                    break;
                case "-":
                    System.out.println("Subtraction is: " + (x - y));
                    break;
                case "*":
                    System.out.println("Multiplication is: " + (x * y));
                    break;
                case "/":
                    System.out.println("Division is: " + (x / y));
                    break;
                case "%":
                    System.out.println("Remainder is: " + (x % y));
                    break;
            }

            System.out.println("Do you wanna continue?");
            String answer = input.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using calculator");
                break;}


        }

        }













    }




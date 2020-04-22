package day18_NestedLoops;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /*
         2. write a program that can retunr the factorial number of any given number
            Ex:
                input: 5
                output: 120
            because:
                5! = 5 * 4 * 3 * 2* 1 = 120
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        int result =1;
        while(num > 0){
            result *= num;
        num--;
       }
        System.out.println("Factorial Number is "+result);




    }
}

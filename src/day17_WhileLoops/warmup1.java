package day17_WhileLoops;

import java.util.Scanner;

public class warmup1 {
    public static void main(String[] args) {

        /*
         1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will nedd for loop and if statement
    2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement
         */

        Scanner input = new Scanner(System.in);
    int MaxNumber = -2147483647;
int MinNumber = 2147483647;

    for(int i = 1; i < 6; i++) {
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
     if(num1>MaxNumber){ MaxNumber = num1;}
    if(num1 <MinNumber){MinNumber = num1;}

    }
    System.out.println("Max number: "+ MaxNumber);
        System.out.println("Min number: "+MinNumber);

}



    }






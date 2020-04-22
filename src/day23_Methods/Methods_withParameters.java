package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        byte age = input.nextByte();
        eligibletobuyalcohol(age);
    }

    public static void eligibletobuyalcohol (int age){
        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

}

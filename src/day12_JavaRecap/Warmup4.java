package day12_JavaRecap;

import java.util.Scanner;

public class Warmup4 {
    public static void main(String[] args) {
        /*
        Revenue can be calculated as the selling price of the product times the quantity sold,
        i.e. revenue = price × quantity. Write a program that asks the user to enter product price
        and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered.
        Program should display the discount and net revenue.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter product price: ");
        double price = input.nextDouble();
        System.out.println("please enter quantity: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        double discount = revenue * 0.1;


        if(quantity>=5000){revenue = revenue- discount;
            System.out.println("your revenue is: "+ revenue);
            System.out.println("your discount is: "+ discount);}
        else{
            System.out.println("your revenue is: "+ revenue);}




    }
}

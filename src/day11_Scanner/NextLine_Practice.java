package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("your age is "+age);

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullname = input.nextLine();

        System.out.println("Your full name is :"+ fullname);
    }
}

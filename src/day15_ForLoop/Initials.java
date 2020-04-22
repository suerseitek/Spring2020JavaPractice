package day15_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

         */
        System.out.println("Enter first name:");
        String name = input.next();

        System.out.println("Enter last name:");
        String lastname = input.next();


        String result =  name.substring(0,1).concat(lastname.substring(0,1));
        result = result.toUpperCase();

        System.out.println(result);






    }
}

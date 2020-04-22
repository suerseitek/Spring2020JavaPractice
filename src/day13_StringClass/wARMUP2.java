package day13_StringClass;

import java.util.Scanner;

public class wARMUP2 {
    public static void main(String[] args) {
        /*
        write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
         */

        Scanner input = new Scanner(System.in);


        System.out.println("Please, enter building number:");

       String buildingnumber = input.next();

   input.nextLine();

        System.out.println("Please, enter street adress:");
String adress = input.nextLine();

        System.out.println("Please, enter city name:");
    String city = input.nextLine();
        System.out.println("Please, enter state");
    String state = input.nextLine();
        System.out.println("Please, enter zipcode:");
    String zipcode = input.next();

    input.nextLine();

        System.out.println("Please, enter name:");
        String name = input.nextLine();

        System.out.println("Ship to: "+ name);
        System.out.println(buildingnumber+" "+adress);
        System.out.println(city +", "+state+" "+zipcode);


    }
}

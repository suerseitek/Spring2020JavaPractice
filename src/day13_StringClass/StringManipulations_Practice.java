package day13_StringClass;

import java.util.Scanner;

public class StringManipulations_Practice {
    public static void main(String[] args) {

        /*
        input: cyBerTek sChool
        output: Cybertek
        School

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1 );

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();


        System.out.println("Your first name is: "+ firstName);
        System.out.println("Your last name is: "+ lastName);


        System.out.println("================================");

 /*
        Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */

String initials = firstName.substring(0,1).toUpperCase()+fullName.substring(fullName.indexOf(" ")+1,
        fullName.indexOf(" ")+2).toUpperCase();
        System.out.println(initials);




    }
}

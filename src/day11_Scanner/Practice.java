package day11_Scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        /*
        Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
         */
        System.out.println("Enter first name:");
        String name = input.next();
        System.out.println("Enter last name: ");
        String lastname = input.next();
        String fullname = name + " "+ lastname;
        System.out.println("Are you employeed?");

        Boolean employeed = input.nextBoolean();

        double salary = 0;

        if(employeed == true){
            System.out.println("Enter your salary:");
        salary = input.nextDouble();
        }
        System.out.println("Full name is: "+fullname);
        System.out.println("Employeed: "+ employeed);
        System.out.println("Salary: "+ salary+" $");


    }
}

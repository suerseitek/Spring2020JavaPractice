package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter building number: ");

        int bnumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter street name:");

        String street = input.nextLine();

        System.out.println("Enter city name:");

        String city = input.nextLine();

        System.out.println("Enter zipcode:");

        int zip = input.nextInt();

        input.nextLine();

        System.out.println("Enter state:");

        String state = input.nextLine();



        System.out.println(bnumber+" "+street+", "+city+", "+state+", "+zip+".");


    }


}


package day12_JavaRecap;

import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {



        /*Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String inp = input.nextLine();
        System.out.println("You entered: "+ inp);


    }
}

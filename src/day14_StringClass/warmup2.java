package day14_StringClass;

import java.util.Scanner;

public class warmup2 {
    public static void main(String[] args) {

        /*
        Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();
        String result = word1.substring(1).concat(word2.substring(1));
        System.out.println(result
        );

    }
}

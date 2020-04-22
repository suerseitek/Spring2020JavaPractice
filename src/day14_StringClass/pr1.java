package day14_StringClass;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        /*
        Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");

        String word = input.next();

        if(word.endsWith("ly")){
            System.out.println("Really?");}
        else{
            System.out.println("Never mind");
        }


    }
}


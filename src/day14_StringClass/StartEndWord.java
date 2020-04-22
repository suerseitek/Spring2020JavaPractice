package day14_StringClass;

import java.util.Scanner;

public class StartEndWord {
    /*
    Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and
	first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
     */
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();

        char ch1 = word1.charAt(4);
        char ch2 = word2.charAt(0);
        if(length1 ==5 && length2==5){
           if(ch1 == ch2){
               System.out.println("Fizz");
           }else {
               System.out.println("Buzz");
           }


        }else{
            System.out.println("Need to be exactly 5 chars length");
        }







    }


}

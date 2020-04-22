package day14_StringClass;

import java.util.Scanner;

public class pr {
    /*
    Ask user to enter a word. Print true is the first and last characters of the string
    are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
     */
    public static void main(String[] args) {

        System.out.println("Enter word");
        Scanner input = new Scanner(System.in);
        String word= input.next();

      int  length = word.length();
      if(word.charAt(0) == word.charAt(length-1)){
          System.out.println("True");
      }else {
          System.out.println("False");
      }






    }
}

package day14_StringClass;

import java.util.Scanner;

public class warmup3 {

    public static void main(String[] args) {

        /*
        3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word");

        String word = input.next();

        int length = word.length();
        int maxindexnum = length -1 ;

        if (length%2 == 0 )
        {String ch = word.substring(maxindexnum/2, maxindexnum/2+2);
           System.out.println("The middle character in the string : "+ch); }

        else

        { char ch1 = word.charAt(maxindexnum/2);
            System.out.println("The middle character in the string : "+ch1); }




    }
}

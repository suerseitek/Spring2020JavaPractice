package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your words:");

        String word = input.nextLine();

        String reverse = "";

        int indexnum = word.length()-1;

        for(int i = indexnum; i >= 0; i--) {
reverse += word.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reverse));



    }
}

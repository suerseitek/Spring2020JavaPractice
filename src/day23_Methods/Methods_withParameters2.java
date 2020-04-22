package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.next();
        reverse(str);
     int [] arr = {1,2,3,4,5};
    }
public static void reverse(String str){
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }






}

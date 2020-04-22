package day22_Arrays_Loops;

import java.util.Scanner;

public class Scanner_Arrays {

    /*
    1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
     */


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String [] arr = new String[5];

        for(int i=0; i<5; i++){
            arr[i] = input.next();

        }
        for(String each: arr ){
            each = each.substring(0,3);
            System.out.println(each);
        }





    }}

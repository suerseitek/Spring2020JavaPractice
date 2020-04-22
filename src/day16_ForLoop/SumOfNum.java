package day16_ForLoop;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {

        /*
        7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int sum =0;
        for(int s = 1; s <= num; s++ ){
            sum +=s;
        }
        System.out.println(sum);

    }
}

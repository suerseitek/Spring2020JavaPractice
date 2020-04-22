package day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] months= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number");

        int num = input.nextInt();

       while(!(num<=12 && num>0)){
            System.out.println("invalid entry");
           System.out.println("please, re-enter the number");
            num = input.nextInt();}

        String result = "";

        result += months[num-1];


        System.out.println(result);

    }
}

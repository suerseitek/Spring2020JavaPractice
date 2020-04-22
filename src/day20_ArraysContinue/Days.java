package day20_ArraysContinue;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        /*
        Create an array that holds the daysUser should be able to enter the
        day index and output should be:“Today is Monday”
         */

        Scanner input = new Scanner(System.in);
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number: ");
        int num = input.nextInt();
int attempts = 1;
        while(!(num <=7 && num >0)){
            System.out.println("invalid entry");
            System.out.println("please re-enter number");
            num = input.nextInt();
        attempts++;
        if((num>7 || num <0) && attempts==3){
            System.out.println("Invalid entry, you already have 3 attempts");
            System.exit(0);
        }
        }
        String result = "";
        result = days[num-1];

        System.out.println("Today is "+ result);





    }
}

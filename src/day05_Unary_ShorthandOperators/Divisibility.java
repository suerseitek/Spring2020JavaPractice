package day05_Unary_ShorthandOperators;

public class Divisibility {

    public static void main(String[] args) {

        /*
        write a program that can check if a number is evenly divisible by 2, 3, 5,
        */

        int num1 = 65;
        boolean b1 = ( num1 % 2 == 0 );
        System.out.println(num1+ " is divisible by 2: " + b1);
        boolean b2 = ( num1 % 3 == 0);
        System.out.println(num1+ " is divisible by 3: "+ b2);
        boolean b3 = (num1 % 5== 0);
        System.out.println(num1 + " is divisible by 5: "+ b3);


    }
}

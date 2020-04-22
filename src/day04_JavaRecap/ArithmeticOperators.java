package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10 / 3;

        System.out.println(a); // = 3

        double b = 10/4;

        System.out.println(b); //= 2.0

        System.out.println(10.0/4); // = 2.5

        System.out.println(10/4.0); // = 2.5

        System.out.println(10.0/4.0); // = 2.5

     float f1 = 10/3f;

        System.out.println(f1);

        System.out.println("================");


        boolean evennumber = 25 % 2 == 0; // if 25/2 has a reminder of zero, then its even number
        System.out.println(evennumber);
        System.out.println(25%2);

        boolean oddnumber = 22 % 2 != 0;
        System.out.println(oddnumber);
        System.out.println(10%2 ==0); //10 is even number
        System.out.println(11 %2 !=0); // 11 is odd number
        System.out.println("10 is even number: "+ (10%2 ==0));
        System.out.println("11 is even number: "+ (11%2==0));
        System.out.println("25 is odd number:" + (25%2 != 0));
        System.out.println("25 is even number:" + (25%2 == 0) );
    }
}









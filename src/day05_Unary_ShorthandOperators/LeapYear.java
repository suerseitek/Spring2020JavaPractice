package day05_Unary_ShorthandOperators;

public class LeapYear {

    public static void main(String[] args) {
        /*
        Create a class called LeapYear, and write a program that can identify if the given is Leap Year,
        print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true

         */

        short year = 2020;
        boolean leapyear = (year % 4 == 0);
        System.out.println(year + " is leap year: " + leapyear);


        System.out.println("================");




    }
}

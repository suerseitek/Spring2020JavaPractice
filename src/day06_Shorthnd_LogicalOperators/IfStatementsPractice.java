package day06_Shorthnd_LogicalOperators;

public class IfStatementsPractice {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }

        if (b > a) {
            System.out.println(b + " is greater than " + a);
        }

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }


        System.out.println("==========================================");

        int x = 300;
        int y = 300;
        boolean xgreater = x > y;
        boolean ygreater = y > x;

        if (xgreater) {
            System.out.println(x + " is greater then " + y);
        }
        if (ygreater) {
            System.out.println(y + " is greater then " + x);
        }
        if (xgreater == false && ygreater == false) {
            System.out.println(x + " is equal to " + y);
        }
// !xgreater || !ygreater


    }}

package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        int a = 100;
        System.out.println( ++ a); //101
        System.out.println(a); //101

        int b = 100;
        System.out.println( --b); //99
        System.out.println(b); //99

        // Post: first passes current value, then eventually changes the variable' value

        int A  = 100;
        System.out.println(A++); // at this line , A' values is still 100
        System.out.println(A); //101

        int B = 200;
        System.out.println(B--); //200
        System.out.println(B); //199

        double t1 = 5.5;
        double t2 = t1--;
        System.out.println(t2);
        System.out.println(t1);
        System.out.println("==================");







    }
}

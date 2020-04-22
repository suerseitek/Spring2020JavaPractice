package day04_JavaRecap;

public class Variables_Practice {

    public static void main(String[] args) {

        byte num1 = 127;
        short num2 = num1; //double > float > long > int > short > byte
        int num4 = num2;
        long num5 = 99999999l;
        float num6 = 100l;
        float num7= 0.5f;
        double num8 = 0.5f;
        double num9 = 9999999l;
        double num10 = 100.5;

        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num10);

        char ch1 = '$'; //every single character has a a corresponding number
        System.out.println(ch1); // $

        char ch2 = 4500; // 0 ~ 65565
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56

        int a2 = 'z';
        System.out.println(a2);

        double d1 = 'z' + '8';
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z'+'8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(9 > 10);
        System.out.println(9 >= 9);
        System.out.println(9 != 10);
        System.out.println('a' == 'b');
        System.out.println('a' == 'b' - 1);

        System.out.println("============");
        System.out.println("Muhtar" == "good guy"); //false
        System.out.println("Muhtar" != "good guy"); //true
        System.out.println("Muhtar" == "muhtar"); //false

        System.out.println("================");

        boolean r1 = !true;//! - means opposite ==> false

        System.out.println(r1); // false
        System.out.println(!r1); // true
        System.out.println (!true == false); //true
        System.out.println( !true != !false ); //true



    }





}

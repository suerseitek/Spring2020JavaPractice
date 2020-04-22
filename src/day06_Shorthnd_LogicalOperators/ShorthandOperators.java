package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x = 20;
        x += 10;
        System.out.println(x);
        x+=60;
        System.out.println(x);

        String schoolname = "CyberTek";
        schoolname+=12345;
        System.out.println(schoolname);
        System.out.println('a'+'b'); //97+98 = 195
         char ch1 = 'a';
         ch1 += 'b';
        System.out.println(ch1); //character
        int num = 'z';
        num +='x';
        System.out.println(num);


        int a1 = 100;
        int b1 = (a1*=2) + ++a1;
        System.out.println(b1);

        int x1 = 10;
        int y1 = x1 +=10*2;
        System.out.println(y1);

        int q = 20;
        int p = q*=20*3;
        System.out.println(p);


        int num2 = 400;
        num2 /= 20 + 10;
        System.out.println(num2);




    }


}

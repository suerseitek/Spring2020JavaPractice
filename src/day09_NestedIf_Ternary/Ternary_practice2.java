package day09_NestedIf_Ternary;

public class Ternary_practice2 {
    public static void main(String[] args) {

        int num1 = 300;
        int num2 = 200;
        int min = (num1 < num2)?num1:num2;
        int max = (num1 > num2)?num1:num2;

        System.out.println(min);
        System.out.println(max);
        System.out.println("===========================");


        int hour = 14;
        String result = (hour<12)?"Good Morning" :(hour >12 && hour <18)?"Good Afternoon":"Goood Evening";
        System.out.println(result);



    }
}

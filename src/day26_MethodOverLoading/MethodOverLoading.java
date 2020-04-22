package day26_MethodOverLoading;

public class MethodOverLoading {


    public static int sum(int a, int b){
    System.out.println(a+b);
    return (a+b);
    }

    public static int sum(int a, int b, int c){
        System.out.println(a+b+c);
        return (a+b+c);
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
        return (a+b+c+d);
    }

    public static void main(String[] args) {
        sum(10,20);

    }



}

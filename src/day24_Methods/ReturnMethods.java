package day24_Methods;

public class ReturnMethods {

    public static void maxNum(int a, int b) {

        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


    }

    public static int Addition(int a, int b) {
        //System.out.println(a+b);
    return a+b;
    }

    public static void main(String[] args) {
        maxNum(10,20);
    int result = Addition(30,25);
        System.out.println(result);
    }



}

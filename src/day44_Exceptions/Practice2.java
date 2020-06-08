package day44_Exceptions;

public class Practice2 {

    public static void waits (double seconds){
        try {
            Thread.sleep( (long)(seconds*1000));
        }catch (Exception e){

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        waits (3.5);
        System.out.println("cybertek");



    }



}

package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{

            System.out.println(str.charAt(400));

        }catch(RuntimeException e){
            String discription  =    e.getMessage();
            System.out.println(discription);
        }

        System.out.println("==========================================");

        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e ){
            System.out.println(e.getMessage());
        }



        System.out.println("Completed");


    }




}

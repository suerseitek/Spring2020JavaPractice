package day40_Encapsultaion;

public class Test {


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // System.out.println( obj.SSN );

        System.out.println( obj.getSSN()  ); //0

        //  obj.SSN = 123456;

        obj.setSSN(123456);
        //   System.out.println( obj.SSN   );

        System.out.println( obj.getSSN()  ); //123456





    }
}

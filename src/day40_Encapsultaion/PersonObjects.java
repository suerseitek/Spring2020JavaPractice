package day40_Encapsultaion;

public class PersonObjects {
    public static void main(String[] args) {
        Person  Zarina = new Person("Zarina");
        System.out.println( Zarina.name );
        //System.out.println( Zarina.SSN );

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN: "+ Zarina.getSSN()); //0

        //  System.out.println( Zarina.ID );
        Zarina.setID(567);
        System.out.println( "Zarina' ID: "+Zarina.getID());




    }



}

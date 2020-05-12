package day37_Constructors;

public class ConstructorIntro {

// public method(){}  // Constructor Name MUST be same with class name

    public ConstructorIntro(int a){  // constructor with argument

        System.out.println("Constructor with argument of int");
    }

    public static void main(String[] args) {

        //  ConstructorIntro obj = new ConstructorIntro();  // object MUST be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10);

        ConstructorIntro obj3 = new ConstructorIntro(10);

    }





}

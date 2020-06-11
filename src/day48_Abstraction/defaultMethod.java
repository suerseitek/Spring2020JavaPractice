package day48_Abstraction;
abstract class T{

    // public default void method2(){ }

}


public interface defaultMethod {

    default void method(){  // only for interface
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        //  method();
        //   defaultMethod obj = new defaultMethod();
    }

}

class N implements defaultMethod{

    public static void main(String[] args) {
        N obj = new N();
        obj.method();

    }

}

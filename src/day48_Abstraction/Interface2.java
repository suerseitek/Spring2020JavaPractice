package day48_Abstraction;

public interface Interface2 {

    int a=100;

    public static void main(String[] args){
        System.out.println(a);
        System.out.println(Interface2.a);
        Interface2.method4();

    }
    static void method4(){}

    void method5();

    default void method6(){
        System.out.println("default method");
    }




}

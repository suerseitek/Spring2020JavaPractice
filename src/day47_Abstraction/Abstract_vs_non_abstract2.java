package day47_Abstraction;

abstract class A {
    public abstract void method1();
    public void method2() { }

}


public class Abstract_vs_non_abstract2 extends A{ // MANDATORY to override the abstratc method of A
    // 2 methods
    public void method1(){

    }

}


abstract class B extends A{  // optional to override the abstratc method of A
// one abstract & one instance methods

    // public abstract void method1();

}

class C extends B{

    public void method1(){

    }

}



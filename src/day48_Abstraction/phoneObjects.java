package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {

        Iphone obj = new Iphone("X", 1000,"10 inches");
        System.out.println(obj);

        Iphone obj1 = new Iphone("8", 900,"8 inches");
        System.out.println(obj1);

        obj1.FaceTiming(342132135);




    }


}

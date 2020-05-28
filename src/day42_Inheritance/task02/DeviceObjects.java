package day42_Inheritance.task02;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","E250", 500, "40 inches" );
        tv1.country = "USA";
        System.out.println( tv1 );

        Phone phone1 = new Phone("Iphone", "11", 1000, "large");


        System.out.println(phone1);

    }
}

package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW","M5");
        Car car3 = new Car("BMW", "X5", 2020);
        Car car4 = new Car ("BMW", "M4", 2020, 80000);

        System.out.println(car4);

    }



}

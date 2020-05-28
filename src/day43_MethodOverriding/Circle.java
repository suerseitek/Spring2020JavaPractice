package day43_MethodOverriding;

public class Circle extends Shape {



        public double radius;
        public static double PI = 3.14;

        public Circle(double radius){
            this.radius = radius;
        }

    /*
    calculateArea & calculatePrimeter
     */

    public void calculateArea(){
        System.out.println("Area of the circle: "+(PI*radius*radius));
    }
    public void calculatePerimeter(){
        perimeter = 0;
        System.out.println("Perimeter of the circle: "+(PI * 2 * radius));
    }


}

package day37_Constructors;

public class Car {

String brand;
String model;
int year;
double price;

public Car(String brand, String model, int year, double price){

    this.brand = brand;
    this.model = model;
    this.price = price;
    this.year = year;
}

    @Override
    public String toString() {
        return brand+" "+model+" "+year+" $"+price;
    }
}

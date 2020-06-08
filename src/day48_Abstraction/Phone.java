package day48_Abstraction;



/*
1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
 */
public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phonenumber);
    public abstract void texting(long phonenumber);

    @Override
    public String toString() {
        return "Brand: " + brand + " | Model: " + model + " | Size: " + size + " | Price: " + price;
    }
}

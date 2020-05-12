package day38_Constructors;

public class Item {

/*
Task04:
	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "name: "+name+" | price: "+unitPrice+" | quantity: "+quantity+" | total cost: $"+(quantity*unitPrice);
    }
}

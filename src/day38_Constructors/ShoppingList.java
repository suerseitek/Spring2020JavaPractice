package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */

    public static void main(String[] args) {

        Item item1 = new Item("apple", 1.55, 2);
        Item item2 = new Item("banana", 2.05, 3);
        Item item3 = new Item("cucumbers", 2.55, 4);
        Item item4 = new Item("potatoes", 1.89, 5);
        Item item5 = new Item("pineapple", 5, 1);

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

        double totalcost = 0;

        for(Item each: list){
            totalcost += each.calcCost();
        }

        System.out.println(totalcost);

    }




}

package day42_Inheritance.task02;

public class Device {

    /*
   creata a class called device:
                  attributes: brand, model, price, country, type
                  methods: toString
   */

        public String brand;
        public String model;
        public double price;
        public static String country = "China";
        public String type;
        public String size;

        public String toString(){
            return "Brand: "+brand+", Model: "+model+", Type: "+type+", size: "+size+", Price: $"+price+", Made in: "+country;
        }

        public void setDevice(String brand, String model, double price, String type, String size){
            this.brand =brand;
            this.model = model;
            this.price=price;
            this.type=type;
            this.size=size;
        }


    }

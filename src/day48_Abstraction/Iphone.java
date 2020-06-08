package day48_Abstraction;

public class Iphone extends Phone {

    @Override
    public void calling(long phonenumber) {
        System.out.println("Calling from iphone to "+ phonenumber);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Texting from iphone to "+ phonenumber);
    }

    public void FaceTiming(long phonenumber){
        System.out.println("Facetiming from iphone to "+ phonenumber);
    }

    public Iphone(String model, double price, String size){
        brand = "Iphone";
        this.model = model;
        this.price = price;
        this.size  = size;

    }



}

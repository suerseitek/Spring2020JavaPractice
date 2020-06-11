package day48_Abstraction;

public class Samsung extends Phone {

    @Override
    public void calling(long phonenumber) {
        System.out.println("Calling from samsung to "+ phonenumber);
    }

    @Override
    public void texting(long phonenumber) {
        System.out.println("Texting from samsung to "+ phonenumber);
    }

    public void freezing(){
        System.out.println("samsung is  freezing");
    }

    public Samsung(String model, double price, String size){
        brand = "Samsung";
        this.model = model;
        this.price = price;
        this.size = size;
    }


}

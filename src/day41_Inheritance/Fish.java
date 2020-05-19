package day41_Inheritance;

public class Fish extends Animal {

    public static void main(String[] args) {

        Fish obj2 = new Fish();

        obj2.name = "Nemo";
        obj2.size = "small";
        obj2.weight = 5;

        obj2.eat();

    }


}

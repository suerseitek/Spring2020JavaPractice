package day34_CustomClass;

public class DogObjects2 {

    public static void main(String[] args) {
        String food1 = "Chicken";
        String food2 = "Fish";

        String drink1 = "milk";
        String drink2 = "coffee";

        String toy1 = "Ps4";
        String toy2 = "Piano";

        String subject1 = "Java";
        String subject2 = "Art";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog2.playing(toy2);
        dog2.playing(toy1);

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("===========================================================");
        Dog[] dogPark = {dog1, dog2, dog3, dog4};

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].eating(food1);
        }

        for(Dog each  : dogPark ){
            each.drinking(drink1);
        }

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].playing("football");
        }


        for(Dog each  : dogPark ){
            each.studying(subject1);
        }




    }



}

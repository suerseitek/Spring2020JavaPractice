package day24_Methods;

public class BirthYear {

    public static void birthyear(int year) {

        int age = 2020- year;
        if(year>2020 || year<1900){
            System.out.println("invalid");
        }else{
            System.out.println("Your age is "+age);
        }

    }

    public static void main(String[] args) {

birthyear(1994);


    }



}

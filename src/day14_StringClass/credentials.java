package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {

        String validUserName = "cybertek";
        String validPassword = "cybertekschool";

        Scanner input = new Scanner(System. in);

        System.out.println("Enter username:");
        String username = input.next();

        System.out.println("Enter password:");
        String password= input.next();


        if(validUserName.equals(username) && validPassword.equals(password)){
            System.out.println("Successfully logged in");
        }else {
            System.out.println("wrong password/username");
        }




    }



}

package day14_StringClass;

import java.util.Scanner;

public class credentials2 {

    public static void main(String[] args) {

        /*
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */

        String validUserName ="cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = input.next();
        System.out.println("Enter password: ");
        String password = input.next();

        if(!username.isEmpty() || !password.isEmpty()){
            if(username.equals(validUserName) && password.equals(validPassWord)){
                System.out.println("Successfully logged in");
            }else if(!username.equals(validUserName) && password.equals(validPassWord)){
                System.out.println("Username is wrong");
            }else if(username.equals(validUserName) && !password.equals(validPassWord)){
                System.out.println("Password is wrong"); }
            else {
                System.out.println("Username and password is wrong");
            }
        }else{
            System.out.println("please enter credentials");
        }








    }







}

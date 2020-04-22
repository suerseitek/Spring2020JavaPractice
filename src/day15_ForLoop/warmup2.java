package day15_ForLoop;

import java.util.Scanner;

public class warmup2 {
    public static void main(String[] args) {

        /*
        2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"

         */
        String validuser = "cybertek.batch17@gmail.com" ;
        String validpassword = "JavaBeauties";

        Scanner input = new Scanner(System.in);

        System.out.println("enter username:");
        String username = input.next();
        username = username.toLowerCase();

        System.out.println("enter password:");
        String password = input.next();

        if(! username.contains("@gmail.com")){
            System.out.println("Its not a valid email");
        } else
if(username.equals(validuser) && password.equals(validpassword)){
    System.out.println("You successfully logged in");
}else{
    System.out.println("invalid username or password");
}

    }

}

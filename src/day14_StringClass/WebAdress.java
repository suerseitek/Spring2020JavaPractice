package day14_StringClass;

import java.util.Scanner;

public class WebAdress {
    public static void main(String[] args) {

        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */

        System.out.println("Enter web adress:");
        Scanner input = new Scanner(System.in);

        String email = input.next();

        email = email.toLowerCase();

        if(email.startsWith("www.")){
            if(email.endsWith(".com") || email.endsWith(".edu") || email.endsWith(".net")
                    || email.endsWith(".gov"))
            {
                System.out.println("Valid web adress");
            }
        }else{
            System.out.println("Invalid web adress");
        }




    }
}

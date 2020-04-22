package day14_StringClass;

public class Practice {

    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result =  gmail.equalsIgnoreCase( userinputGmail );  // true

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("==================================");
        /*
        valid password should not conatin spaces
         */

        String PassWord = "mmasd 1235";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }

        System.out.println("==================================");
        /*
        every website has "www." at the begenning of the web address
         */

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();

        if( webAddress.startsWith("www.") ){
            // false
            System.out.println("valid");

        }
        System.out.println("==================================");

        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */



    }



}

package day40_Encapsultaion;

public class CredentialsObject {


    public static void main(String[] args) {


        Credentials facebook = new Credentials();
        facebook.setUserName("Admin");
        facebook.setPassWord("KKKK");

        System.out.println(facebook.getPassWord());
        System.out.println(facebook.getUserName());



    }







}

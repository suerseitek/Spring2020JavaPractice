package day24_Methods;

public class StringReverse {


    public static String Reverse(String str){

        String Reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            Reverse +=str.charAt(i);
        }

        return Reverse;
    }



    public static void main(String[] args) {
        String str = "java";
    String reversestr =     Reverse(str);
        System.out.println(reversestr);
    }

}

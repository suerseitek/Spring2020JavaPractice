package day17_WhileLoops;

public class PalindromeWhileLoop {

    public static void main(String[] args) {

        String str = "toyot";

        String reversestr = "";

      int index = str.length()-1;

      while (index >= 0){

          reversestr += str.charAt(index);
          index--;
      }

        System.out.println(str);
      System.out.println(reversestr);

      if(str.equalsIgnoreCase(reversestr)){
          System.out.println("this word is palindrome");
      }






    }
}

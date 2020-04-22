package day26_MethodOverLoading;

public class Uniques {

    /*2. use the above method to create another called uniques that accepts a string parameter
     and returns it's unique characters as String
            Ex: uniques("ABBC");      ==> "AC"
                uniques("Cybertek");      ==> "cybrtk"


     */
    public static int FreqOfChar(String str, char ch) {

        char [] arr = str.toCharArray();
        int count = 0;
        for(char each: arr){
            if(each == ch){
                count++;
            }
        }
        return count ;
    }

    public static String Uniques(String str){
       String result = "";
     for(int i = 0; i<str.length(); i++){
         int num = FreqOfChar(str, str.charAt(i));
         if(num ==1){result += str.charAt(i);}

     }
       return result;
   }



    public static void main(String[] args) {

        String str = "Cybertek";
        String result = Uniques(str);
        System.out.println(result);


    }




}

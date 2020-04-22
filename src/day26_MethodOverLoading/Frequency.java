package day26_MethodOverLoading;

public class Frequency {
/*
 1. write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

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
    public static void main(String[] args) {

        int count = FreqOfChar("AAAAAA",'A');
        System.out.println(count);
    }




}

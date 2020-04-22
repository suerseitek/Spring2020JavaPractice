package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {


        String name= "Muhtar";
        char[] characters = name.toCharArray();
        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek school".toLowerCase();
        String str2 = "school Cybertek".toLowerCase();
        char[] char1 = str1.toCharArray();
        Arrays.sort(char1);
        System.out.println(Arrays.toString(char1));
        char [] char2 = str2.toCharArray();
Arrays.sort(char2);
        System.out.println(Arrays.toString(char2));
boolean result = Arrays.equals(char1, char2);
        System.out.println(result);

    }}

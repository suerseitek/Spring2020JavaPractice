package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.frequency;

public class Uniques {

    public static void main(String[] args) {


        Character[] chars = {'A','A','B','C','D','D'};

        ArrayList <Character> charlist = new ArrayList<>(Arrays.asList(chars));

        System.out.println(charlist);

 ArrayList<Character> result = new ArrayList<>();

 for(Character each: charlist){
     if(frequency(charlist, each)==1){
         result.add(each);
     }
 }

        System.out.println(result);
    }





}

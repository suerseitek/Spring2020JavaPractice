package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {


/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D", "B"));

        ArrayList<String> sss = new ArrayList<>();



        for(String each: list){

            int count =0;
            for(int i= 0; i< list.size(); i++){

                if(each.equals(list.get(i))){
                    count ++;
                }}

                if(count >1 && !sss.contains(each)){
                    sss.add(each);
                }



        }
        System.out.println(sss);



    }



}

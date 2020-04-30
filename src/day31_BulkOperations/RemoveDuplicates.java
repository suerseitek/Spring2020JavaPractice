package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,5,2,3,3,4));

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<list.size(); i++){

            if(!result.contains(list.get(i))){
                result.add(list.get(i));
            }

        }
        System.out.println(result);



    }








}

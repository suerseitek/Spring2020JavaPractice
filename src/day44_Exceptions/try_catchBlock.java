package day44_Exceptions;


import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlock {

    public static void main(String[] args) {
        System.out.println("Test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try {

        }catch (IndexOutOfBoundsException e){

        }

        System.out.println("Test completed");

    }


}

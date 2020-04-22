package day24_Methods;

import Resources.Library;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String str= "Cybertek";
     String revers = Library.Reverse(str);

        System.out.println(revers);
        int [] arr = {200,3424,4234,234,234324};
        arr = Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));

    }



}



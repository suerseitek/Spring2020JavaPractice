package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warmup {


    public static void main(String[] args) {
         /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8));

    int max =Collections.max(numbers);
    numbers.removeAll(Arrays.asList(max));

    int min =Collections.min(numbers);
    numbers.removeAll(Arrays.asList(min));

    int secondmax = Collections.max(numbers);
    int secondmin = Collections.min(numbers);


        System.out.println(secondmax);
        System.out.println(secondmin);


    }
}

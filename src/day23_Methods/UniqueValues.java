package day23_Methods;

import java.util.Arrays;
public class UniqueValues {

    /*
    	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
     */

    public static void main(String[] args) {

String [] arr = {"A", "B", "B", "C","D", "E"};


for(String each: arr){
    int count = 0;

    for(String each1: arr){
        if(each.equals(each1)){
            count++;
        }
    }
    if(count ==1){
        System.out.print(each+" ");
    }
}
        System.out.println();
System.out.println("=====================================");

for(int i = 0; i<arr.length; i++){
    int count2 = 0;
    for(String each2: arr){
        if(arr[i].equals(each2)){
            count2++;
        }
    }
    if(count2 ==1){
        System.out.print(arr[i]+ " ");
    }
}

    }

}

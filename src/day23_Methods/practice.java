package day23_Methods;

import java.util.Arrays;

public class practice {
/*
    1. create a a function that can print the maximum number from any given array
	5. create a a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */

    public static void maxnum (int arr []){
        int maxn = arr[0];
        for(int i=0; i<arr.length;i++){

            if(arr[i]>maxn){maxn= arr[i];}
        }
        System.out.println("Max number is: "+ maxn);
    }


    public static void minnum (int arr[]){

        int min = arr[0];
    for(int i= 0; i<arr.length; i++){
        if(min>arr[i]){min = arr[i];}
    }
        System.out.println("Min number is: "+min);
    }

    public static void descending (int arr[]) {

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] arr2 = {2,2,35,4,5,555,-43};
        maxnum(arr2);
        minnum(arr2);
        descending(arr2);

    }


}

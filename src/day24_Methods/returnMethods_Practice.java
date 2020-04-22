package day24_Methods;

import java.util.Arrays;

public class returnMethods_Practice {

    public static void main(String[] args) {
        int[] arr = {9,6,32,43,234,2};
        int maxnumber = Maxnum(arr);
        int min = Minnum(arr);
        System.out.println(maxnumber);
        System.out.println(min);

    }

    public static int Maxnum(int arr[]) {
        Arrays.sort(arr);
        int maxnum = arr[arr.length-1];
        return maxnum;
    }
    public static int Minnum (int [] arr){
        Arrays.sort(arr);
        int minnum = arr[0];
        return minnum;

    }



}

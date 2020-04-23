package day27_DateTime;

public class warmup {

    /*
    1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.

     */

    public static int minnum(int[]arr) {
        int minimum = arr[0];
        for(int each: arr){
            if(each<minimum){minimum = each;}
        }
        System.out.println(minimum);
        return minimum;
    }

    public static double minnum(double[]arr) {
        double minimum = arr[0];
        for(double each: arr){
            if(each<minimum){minimum = each;}
        }
        System.out.println(minimum);
        return minimum;
    }


    public static void main(String[] args) {
        int [] arr = {1,23,4234,2,34,0};
       double[] arr2 = {2.5,23273, 1.1, 423};
        minnum(arr);
        minnum(arr2);
    }


}

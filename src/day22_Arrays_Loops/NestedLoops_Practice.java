package day22_Arrays_Loops;

public class NestedLoops_Practice {

    public static void main(String[] args) {

        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

int oddcount = 0;
        for(int i=0; i<numbers.length; i++){
            for(int eacheven : numbers[i]){
                if(eacheven%2==0){
                    System.out.print(eacheven+ " ");
                }
                if(eacheven%2 !=0){
                 oddcount++;
                }

            }
        }

        System.out.println();
        System.out.println("count of odd: "+ oddcount);


    }}

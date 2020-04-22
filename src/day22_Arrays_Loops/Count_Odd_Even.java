package day22_Arrays_Loops;

public class Count_Odd_Even {

    public static void main(String[] args) {

        /*
        write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
         */



        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int counteven = 0;
        int countodd = 0;

        for(int eachnumber: arr){
            if(eachnumber%2==0){
                counteven++;
            }
            if(eachnumber%2 !=0){
                countodd++;
            }
        }
        System.out.println("count of even: "+ counteven);
        System.out.println("count of odd: "+ countodd);

    }}

package day18_NestedLoops;

public class Triangle {

    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */

        int j = 1;
        while(j<=7){

            int i = 1;
            while(i <= j){
                System.out.print("* ");
                i++;
            }

            System.out.println();


            j++;
        }


        System.out.println("======================================================");



        int z2 = 7;
        while(z2 >= 1){

            int i2 = 1;
            while(i2 <= z2){
                System.out.print("* ");
                i2++;
            }

            System.out.println();


            z2--;
        }











    }


}
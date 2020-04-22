package day22_Arrays_Loops;

public class Nested_ForEach {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //   0 1 2 3 4

        for(int each   : arr){
            System.out.println(each);
        }

        System.out.println("======================================");

        int[][] arr2D = { {1,2,3}, {4,5,6}  };
        //                   0        1

        for(int[]  each1Darray: arr2D ){

            for( int eachElement  : each1Darray ){

                System.out.println(eachElement);

            }

        }

        System.out.println("======================================");

        char[][] ch2D = {  {'A', 'B'} , {'C', 'D', 'E'} , {'F', 'J', 'H'}  };
        //                      0            1

        for(char[] each1DArray   :  ch2D ){  //2

            for( char eachElement  : each1DArray ){

                System.out.println(eachElement);

            }

        }











    }

}
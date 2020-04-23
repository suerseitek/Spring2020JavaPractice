package day27_DateTime;

public class warmup2 {
    /*
    3. write a method that can print out the unique elements from an int array
                    Ex: {1,1,2,3,3} ==> 2
                        {6,6,7,7,8,9} ==> 8 9
        4. write a method that can print out the unique elements from a double array
                    Note: Apply method overloading

     */
    public static void main(String[] args) {
        int [] arr ={1,23,5345,213,2,2,2,2};
    double[] arr2= {2.4,55.5, 55.5, 66.0,88};

    UniqueElementsArray(arr);
        System.out.println("===========================");
        UniqueElementsArray(arr2);
    }

    public static void UniqueElementsArray(int[] arr){


        for(int each: arr){
            int count =0;
            for(int each2: arr){

                if(each==each2){
                    count ++;
                }


            }
            if (count==1){
                System.out.println(each);
            }


        }




    }

    public static void UniqueElementsArray(double[] arr){


        for(double each: arr){
            int count =0;
            for(double each2: arr){

                if(each==each2){
                    count ++;
                }

            }
            if (count==1){
                System.out.println(each);
            }

        }




    }
}

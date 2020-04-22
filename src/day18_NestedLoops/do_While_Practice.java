package day18_NestedLoops;

public class do_While_Practice {
    /*
       print all the even number 0 ~ 100 in the same line seperated by a space
        */
    public static void main(String[] args) {

        int num = 0;

        do{

            if(num % 2 == 0 ) {
                System.out.print(num + " ");
            }

            num++;
        } while(num <= 100);

        System.out.println();

        System.out.println("==============================");
        int i = 1; //2
        do{
            System.out.println(i);
            i++;
        }while(i <= 5);

        System.out.println("==============================");

        int z =1;
        do{
            System.out.println(z);
            if(z == 2){
                break;
            }

            z++;
        }while(z <= 5);



    }


}
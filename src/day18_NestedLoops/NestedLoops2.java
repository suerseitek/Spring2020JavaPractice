package day18_NestedLoops;

public class NestedLoops2 {

    public static void main(String[] args) {


        for(int j = 1; j <=9; j++){

            for(int i = 1; i<=j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");


for(int a= 9; a >= 0; a-- ){

    for(int b = 1; b <= a;b++){
        System.out.print("* ");
    }
    System.out.println();

}

        System.out.println("==================");

for(char z = 'a'; z <='z'; z++) {

    for (char ch = 'a'; ch <= z; ch++) {

        System.out.print(ch + " ");
    }
    System.out.println();
}

        System.out.println("==================");

        for(char z1 = 'z'; z1 >='a'; z1--) {

            for (char ch = 'a'; ch <= z1; ch++) {

                System.out.print(ch + " ");
            }
            System.out.println();
        }






    }


}

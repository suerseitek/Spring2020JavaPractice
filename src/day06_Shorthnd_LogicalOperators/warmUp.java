package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {
/*
warmup task:
	1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;
 */
        double gallon = 5;

        double litter = gallon*3.785;

        System.out.println(gallon + " gallon = " + litter+ " litters");

        System.out.println("=======================================");

        double litters = 3.785;
        double gal = litters/3.785;
        System.out.println(litters+" litters = "+gal+" gallons");

        System.out.println("=======================================");

        int a = 200;
        int b = -a++ + - --a * a--%2;
        /* b = - 200 + - 200 * 200 % 2
           b = - 200 + - 40000 % 2
           b = - 200 +  0
        * */
        System.out.println(b);
        System.out.println(a);
        System.out.println("=======================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
         /* z = 300 + 400 - 300*400 +300/400
         z = 700 - 120000 + 0
         z = -119300
         */
         System.out.println(z);


    }
}

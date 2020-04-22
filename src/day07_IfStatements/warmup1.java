package day07_IfStatements;

public class warmup1 {

    public static void main(String[] args) {


        /*
        1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         Write a program that declares three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump
	         */

    int angle1 = 90;
    int angle2 = 45;
    int angle3 = 45;
    if(angle1 + angle2 + angle3 ==180){
        System.out.println("triangle is valid");}

        if(angle1 + angle2 + angle3 !=180){
            System.out.println("triangle is not valid");}

        System.out.println("====================================");

        double num1 = 10000;
        double num2= 200000;
        double num3 = 3000;

        if(num1 > num2 && num1 >num3){
            System.out.println(num1+" is max number");}
        if(num2 >num1 && num2 >num3){
            System.out.println(num2+" is max number");}
        if(num3> num1 && num3>num2){
            System.out.println(num3+" is max number");}

        System.out.println("====================================");

        if(num1<num2 && num1 <num3){
            System.out.println(num1+" is min number");}
        if(num2<num1 && num2<num3){
            System.out.println(num2+" is min number");}
        if(num3<num1 && num3<num2){
            System.out.println(num3+" is min number");}

        System.out.println("====================================");

        if(num1>num2 && num1<num3 || num1<num2 && num1>num3 ){
            System.out.println(num1 + " is medium number");}
        if(num2>num1 && num2<num3 || num2<num1 && num2>num3) {
            System.out.println(num2 + " is medium number");}
        if(num3>num1 && num3<num2 || num3<num1 && num3>num2){
            System.out.println(num3 + " is medium number"); }

        System.out.println("===================================");

        int age = 20;
        boolean citizen = true;
        boolean eligible = (age >= 18 && citizen == true);
        if(eligible){ System.out.println("You are eligible for vote");}
        if(!eligible){System.out.println("You are not eligible to vote");}

    }
}

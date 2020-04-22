package day08_IfStatements;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Random;
import java.util.Scanner;

public class warmup2 {
    public static void main(String[] args) {
        /*
        .  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
         */





        int n1 = 5;
        int n2 = 2;
        int n3 = 6;
        if(n1 == n2 && n1 != n3){ System.out.println(n1+" & " +n2+" are equal");}
        if(n3 == n1 && n1 != n2){System.out.println(n3+" & "+n1+" are equal");}
        if(n2 == n3 && n1 != n2){System.out.println(n2+" & "+n3+" are equal");}
if(n1 == n2 && n1 == n3){ System.out.println("all equal");}
if(n1 != n2 && n2 != n3 && n1 != n3){System.out.println("none of them are equal");}

        System.out.println("=======================================");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many days:");
        int days = input.nextInt();
        if(days == 30){
            System.out.println("April, June, September, November has 30 days in a year");}
        if(days == 31){
            System.out.println("January, March, May, July, August, October, December has 31 days in a year");}
        if(days ==28){
            System.out.println("February has 28 days in a year");}
if(days != 30 && days !=31 & days !=28){
    System.out.println("there is no months with this amount days");}


    }
}



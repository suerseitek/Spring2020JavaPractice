package day12_JavaRecap;

import java.util.Scanner;

public class warmup3 {
    public static void main(String[] args) {


        /* Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade:");
        int grade = input.nextInt();
        if (grade > 0 && grade <= 100) {
        if(grade < 60 ){
            System.out.println("FAil");}else if(grade>=60 && grade<90){
            System.out.println("Pass");} else{
            System.out.println("Passed with Distinction");}
//(grade < 60)?"fail":(grade >= 60 && grade < 90)?"pass":(grade>=90)?"Passed with Distinction";
    }else{
            System.out.println("Enter from 0 - 100.");
        }
    }
}

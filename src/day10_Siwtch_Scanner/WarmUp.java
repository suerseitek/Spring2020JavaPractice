package day10_Siwtch_Scanner;

public class WarmUp {
    public static void main(String[] args) {
        /*
        2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
	3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
         */

        int daynumber = 8;
        /*
        if(daynumber >=1 && daynumber <=7){
        .....}
        else{System.out.println("invalid number");}

         */

        String result  = (daynumber==1)?"Monday":(daynumber ==2)?"Tuesday":
                (daynumber==3)?"Wednesday":(daynumber ==4)?"Thursday":(daynumber==5)?
                        "Friday":(daynumber==6)?"Saturday":(daynumber ==7)?"Sunday":"Invalid number";


        System.out.println(result);
        System.out.println("==========================");

        int num = 1;
        String ch1 = (num ==0 )?"zero" : (num == 1)?"One":(num == 2)?"two":(num==3)?"three":(num==4)?"four":
                (num==5)?"five":(num == 6)?"six":(num==7)?"seven":(num ==8)?"eight":(num==9)?"nine" : "invalid";
        System.out.println(ch1);

        System.out.println("==========================");


int monthsnumber = 5;
if(monthsnumber >=1 && monthsnumber<=12){
    if(monthsnumber==2){
        System.out.println("this month has 28  days");}else if (monthsnumber == 4 && monthsnumber==6 &&
            monthsnumber==9 && monthsnumber==11){
        System.out.println("this month has 30 days");}else {
        System.out.println("this month has 31 days");}

}
else{
    System.out.println("Invalid number");}


    }
}

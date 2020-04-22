package day08_IfStatements;

public class DaysInMonth {
    public static void main(String[] args) {
        /*
        write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
         */

  byte month = 3;
  if(month==1 || month ==3 || month == 5 || month == 7 || month == 8 || month==10 || month ==12)
  {
      System.out.println("there is 31 days in this month"); }
  if(month==4 || month ==6 || month ==9 || month == 11){
      System.out.println("there is 30 days in this month");}
  if(month == 2){
      System.out.println("there is 28 days in this month");}





    }
}

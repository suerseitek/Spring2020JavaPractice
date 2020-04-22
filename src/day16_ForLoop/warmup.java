package day16_ForLoop;

public class warmup {
    public static void main(String[] args) {
/*
warmup tasks:
	1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
	2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
	3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
	4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;

 */

for(int i =1; i<=100; i++){

  if (i%2 !=0){
    if(i%3 ==0 && i%5 ==0){
        System.out.print(i+" "); }
  }
  }


}


    }

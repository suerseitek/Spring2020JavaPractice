package day08_IfStatements;

public class EqualNumbers_multibranchIF {
    /*
    write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
     */
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        int n3 = 5;
       String result = "";
        if(n1 == n2 && n1 != n3){
            result = "n1   &  n2  is equal";}
    else if(n2 == n3 && n1 != n2){
            result = "n2  &  n3  is equal";}
    else if(n1 == n3 && n2 !=n3){
            result = "n3  &  n2  is equal";}
    else if (n1 ==n2 && n2 == n3){
            result = "all of them are equal";}
    else{
            result = "none of them are equal";}
        System.out.println(result);







    }










}

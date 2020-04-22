package day24_Methods;

public class Warmup {

    /*
    1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false

     */

    public static void max(int num1, int num2) {
        if (num1 >= num2) {
            System.out.println("maximum number is: "+ num1);}else{
            System.out.println("maximum number is: "+ num2);}

        }

    public static void calculation(int num1, int num2, char ch){
        int result = 0;
        if(ch == '+'){
            result =num1+num2;
        }else if(ch == '-'){
            result = num1 - num2;
        }else if(ch == '*'){
            result = num1*num2;
        }else if(ch == '/'){
            result = num1/num2;
        }else if(ch =='%'){
            result = num1%num2;
        }else{
            System.out.println("invalid");
        }
        System.out.println(result);

    }

    public static void palindrome (String str){
        String reverse = "";
        for(int i =str.length()-1; i>=0;i--){
            reverse +=str.charAt(i);
        }
       if(reverse.equalsIgnoreCase(str)){
           System.out.println("this word is palindrome");
       }else{
           System.out.println("this word is not palindrome");
       }
    }

    public static void main(String[] args) {
        int a =19;
        int b =20;
       String str = "toyot";

        max(a,b);
        calculation(a,b,'*');
        palindrome(str);

    }

    }



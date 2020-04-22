package day13_StringClass;
import java.util.Scanner;
public class Warmup1 {

    public static void main(String[] args) {

        /* write a java program that can convert any given numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement

        */

Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");

int num = input.nextInt();

switch (num){
    case 0:
        System.out.println("Ola");
        break;
    case 1:
        System.out.println("Salam");
        break;

    case 2:
        System.out.println("Hi");
        break;
    case 3:
        System.out.println("Hello");
        break;
    case 4:
        System.out.println("Privet");
        break;
    case 5:
        System.out.println("Namaste");
        break;
    case 6:
        System.out.println("Aloha");
        break;
    case 7:
        System.out.println("Salut");
        break;
    case 8:
        System.out.println("CIAO");
        break;
    case 9:
        System.out.println("Merhaba");
        break;
    default:
        System.out.println("Invalid");
}

String result = (num == 0)?"Zero":(num == 1)?"One":(num ==2)?"Two":(num == 3)?"Three":( num ==4)? "Four":
        (num == 5)?"Five":(num == 6)?"Six":(num ==7 )?"Seven":(num == 8 )?"Eight":(num==9)?"Nine":"Invalid";

        System.out.println(result);

    }



}

package day18_NestedLoops;

import java.util.Scanner;

public class assignemnt {

    public static void main(String[] args) {


         /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */


        Scanner input = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("*** Welcome to our hotel! ***");
        System.out.println("*****************************");
        while (true) {
            System.out.println("\nWhat kind of room do you want?"+
                            "\n*****************************"+
                    "\nKing Bed, Queen Bed or Single Bed? ");

            String roomtype = input.nextLine();
            int price = 0;
            int nights =0;
            while(!(roomtype.equalsIgnoreCase("king bed") || roomtype.equalsIgnoreCase("queen bed")
            || roomtype.equalsIgnoreCase("single bed"))){
                System.out.println("Invalid entry, please enter valid room type");
                roomtype = input.nextLine();
            }
if(roomtype.equalsIgnoreCase("king bed")){
    System.out.println("King Bed is selected. price is 120$"+
            "\nHow many nights do you want to stay?");

    nights = input.nextInt();
    price +=120;
    System.out.println("Your total is for "+nights+" nights is: "+ (nights*price)+" $");
}else if(roomtype.equalsIgnoreCase("queen bed")){
    System.out.println("Queen Bed is selected. price is 100$"+
            "\nHow many nights do you want to stay?");

    nights = input.nextInt();
    price +=100;
    System.out.println("Your total is for "+nights+" nights is: "+ (nights*price)+" $");}
else if(roomtype.equalsIgnoreCase("single bed")){
    System.out.println("Single Bed is selected. price is 100$"+
            "\nHow many nights do you want to stay?");

    nights = input.nextInt();
    price +=80;
    System.out.println("Your total is for "+nights+" nights is: "+ (nights*price)+" $");}

            System.out.println("*************************************");
            System.out.println("Do you want to reserve another room?");
String answer = input.next();

while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")))
{
    System.out.println("Enter correct answer YES or NO");
    answer = input.next();
}
if(answer.equalsIgnoreCase("no")){break;}
            input.nextLine();
}






}}

package day09_NestedIf_Ternary;

public class ageGroups {
    public static void main(String[] args) {
        /* write a program that can define the age groups of a person age gropus are:
         baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */

        int age = 7;
        String result =" ";
        if(age < 3 && age > 0) {result = "Baby";}
        else if(age>=3 && age<=5){result="Toddler";}
        else if(age>=6 && age<=9){result="Kid";}
        else if(age>=10 && age<=12){result="Pre-teen";}
        else if(age>=13 && age<=17){result="Teenager";}
        else if(age>=18 && age <=20){result="Young adult";}
        else if(age>=21 && age <=39){result="Adult";}
        else if(age>=40 && age <=49){result="Young middle-aged adult";}
        else if(age>=50 && age <=54){result="Middle-aged adult";}
        else if(age>=55 && age<=64){result="Very young Senior citizen";}
        else if(age>=65 && age<=74){result="Young Senior citizen";}
        else if(age>=75 && age<=84){result="Senior citizen";}
        else if(age>=85 && age<=150){result="Old Senior citizen";}
        else{result="invalid entry";}



        System.out.println(result);

boolean eligibleToBuy= result =="Adult" || result ==  "Young middle-aged adult" ||
        result == "Middle-aged adult";
if(eligibleToBuy){
    System.out.println("You are eligible to buy alcohol");}
else{
    System.out.println("You are not eligible to buy alcohol");}

boolean healthy = result =="Very young Senior citizen" || result == "Young Senior citizen" ||
        result == "Senior citizen" || result == "Old Senior citizen";
if(healthy){
    System.out.println("Its not healthy to drink alcohol");}



    }
}

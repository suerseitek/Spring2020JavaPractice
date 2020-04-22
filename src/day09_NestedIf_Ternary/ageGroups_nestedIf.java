package day09_NestedIf_Ternary;

public class ageGroups_nestedIf {
    public static void main(String[] args) {
  /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
        int age = 34;
        String group = "";

    if(age>0 && age<=150) {
        if (age < 21) {
            System.out.println("Teenager");
        } else if (age >= 21 && age < 55) {
            System.out.println("Adult");
        } else if (age >= 55) {
            System.out.println("Senior");
        }

    }
        else{
            System.out.println("invalid number");}


        System.out.println("======================");

        int age2 = 34;
        String agegroups = "";
        if(age<150 && age > 0){
            agegroups = (age2<21)?"Teenager":(age2<55 && age2>=21)?"Adult":"Senior";
        }else{
agegroups = "Invalid Entry";
        }

        System.out.println(agegroups);




}}

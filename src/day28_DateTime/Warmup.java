package day28_DateTime;

import sun.jvm.hotspot.ui.EditableAtEndDocument;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Warmup {

    public static void main(String[] args) {

/*
    1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */

String [] names = {"Seitek", "Aidar", "Sultan", "Altay", "Arsen"};
        LocalDate[] birthdays = new LocalDate[names.length];
        birthdays[0]= LocalDate.of(1994,05,10);
        birthdays[1]= LocalDate.of(2000, 02,27);
        birthdays[2] = LocalDate.of(2003, 04, 12);
        birthdays[3]=LocalDate.of(2008,06, 14);
        birthdays[4]= LocalDate.of(2014, 9, 30);

        int j =0;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-EEEE-yyyy");

        for(int i = 0; i<names.length; i++){
            System.out.print(names[i]+" "+birthdays[j].format(dtf)+" \n");
            j++;
        }


    }




}

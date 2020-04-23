package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GGGG {
/*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Apr/23/20
         */


    public static void main(String[] args) {
        LocalDate birthday =LocalDate.of(1994,05,10);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("MMM dd EEE yyyy");
        System.out.println(birthday.format(d));

    }





}

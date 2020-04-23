package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesFormatting {
    public static void main(String[] args) {

        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf) );

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Aprl/23/20
         */




    }

}
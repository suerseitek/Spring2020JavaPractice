package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {

    public static void main(String[] args) {

        LocalTime time  = LocalTime.of(16,30);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh a: mm");
        System.out.println(time.format(dtf));
    }






}

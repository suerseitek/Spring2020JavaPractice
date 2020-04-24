package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hha:mm:ss");

        LocalTime time1 = LocalTime.now();
        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(15, 30,45);
        System.out.println(time2.format(dtf));

    }


}

package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy \nhh:mm a");

        System.out.println(dt.format(dtf));

        LocalDate date = LocalDate.of(1994, 05,10);
        LocalTime time = LocalTime.of(07,30,05);
        LocalDateTime datetime = LocalDateTime.of(date, time);
        System.out.println(datetime.format(dtf));

    }


}

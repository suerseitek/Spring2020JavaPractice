package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {




        LocalDateTime datetim1 = LocalDateTime.of(2015, 12,25,11,30,45);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eee MM/dd/yyyy hh:mm a");
        System.out.println(datetim1.format(dtf));
    }
}

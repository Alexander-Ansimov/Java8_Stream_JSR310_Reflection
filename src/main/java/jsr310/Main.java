package jsr310;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime newNow = now.withHour(12);
        System.out.println(newNow);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/dd/MMM hh:mm");

        String dateInString = now.format(formatter);
        System.out.println(dateInString);


        LocalDateTime afterTomorrow = now.plusDays(2);
        long between = ChronoUnit.HOURS.between(now, afterTomorrow);
        System.out.println(between);

    }
}

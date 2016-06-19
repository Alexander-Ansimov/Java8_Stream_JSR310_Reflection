package jsr310;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.Month.JANUARY;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class Friday13Service {
    public Map<Integer, Long> top10YearsWithFriday13(int yearStart, int yearEnd) {
        LocalDate startDate = LocalDate.of(yearStart, JANUARY, 1);
        LocalDate endDate = LocalDate.of(yearEnd, JANUARY, 1);

        Stream<LocalDate> allDaysInRange = Stream.iterate(startDate, localDate -> localDate.plusDays(1)).
                limit(ChronoUnit.DAYS.between(startDate, endDate));
        Stream<LocalDate> fridays13 = allDaysInRange.filter(day -> day.getDayOfWeek() == FRIDAY)
                .filter(day -> day.getDayOfMonth() == 13);
        return fridays13.collect(Collectors.groupingBy
                (LocalDate::getYear,Collectors.counting())).entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).limit(3).
                        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }

    public static void main(String[] args) {
        System.out.println(new Friday13Service().top10YearsWithFriday13(1999, 8016));
    }
}














package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2023-11-21");
        LocalDateTime date2 = LocalDateTime.parse("2023-11-21T01:30:55");
        Instant date3 = Instant.parse("2023-11-21T01:30:55Z");

        LocalDate pastWeekLocalDate = date1.minusDays(7);
        LocalDate nextWeekLocalDate = date1.plusDays(7);

        System.out.println("PasteWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();


        LocalDateTime pastWeekLocalDateTime = date2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = date2.plusDays(7);
        LocalDateTime plus_hours = date2.plusHours(5);
        LocalDateTime plus_year = date2.plusYears(2);

        System.out.println("PasteWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("NextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("PlusHours = " + plus_hours);
        System.out.println("PlusYear = " + plus_year);

        System.out.println();

        Instant pastWeekInstant = date3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = date3.plus(7, ChronoUnit.DAYS);
        Instant plus_hour_instant = date3.plus(5, ChronoUnit.HOURS);
        Instant minus_hour_instant = date3.minus(5, ChronoUnit.HOURS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("Plus_hours_instant = " + plus_hour_instant);
        System.out.println("minus_hour_instant = " + minus_hour_instant);

        System.out.println();

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), date1.atTime(0,0));
        Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), date1.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,date2);
        Duration t3 = Duration.between(pastWeekInstant, date3);
        Duration t4 = Duration.between(date3, pastWeekInstant);
        Duration t5 = Duration.between(nextWeekInstant, date3);

        Duration t6 = Duration.ofHours(336);
        Duration t7 = Duration.of(9, ChronoUnit.DAYS);
        Duration t8 = Duration.ofMinutes(360);

        System.out.println("Duração t1 dias = " + t1.toDays());
        System.out.println("Duração t01 dias = " + t01.toDays());
        System.out.println("Duração t2 dias = " + t2.toDays());
        System.out.println("Duração t3 dias = " + t3.toDays());
        System.out.println("Duração t4 dias = " + t4.toDays());
        System.out.println("Duração t5 dias = " + t5.toDays());
        System.out.println();
        System.out.println("T6 minutos: " + t6.toMinutes());
        System.out.println("T6 dias: " + t6.toDays());
        System.out.println("T7 hours: " + t7.toHours());
        System.out.println("T7 minutes: " + t7.toMinutes());
        System.out.println("T8 hours: " + t8.toHours());
        System.out.println("T8 segundos: " + t8.toSeconds());

    }
}
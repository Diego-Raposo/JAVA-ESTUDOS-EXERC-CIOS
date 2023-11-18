package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();
        LocalDate date4 = LocalDate.parse("20/11/2023", fmt2);
        LocalDateTime date5 = LocalDateTime.parse("2023-11-20T01:30:26");
        Instant date6 = Instant.parse("2023-11-20T01:30:26Z");
        Instant date7 = Instant.parse("2023-11-20T01:30:26-03:00");


        LocalDate date8 = LocalDate.parse("17/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDateTime date9 = LocalDateTime.parse("19/12/1999 17:35", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate date10 = LocalDate.of(2022, 12, 19);
        LocalDateTime date11 = LocalDateTime.of(2023,12,13,15,30);

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("date3: " + date3);
        System.out.println("date4: " + date4.toString());
        System.out.println("date5: " + date5);
        System.out.println("date6: " + date6);
        System.out.println("date7: " + date7);
        System.out.println("date8: " + date8);
        System.out.println("date9: " + date9);
        System.out.println("date10: " + date10);
        System.out.println("date11: " + date11);

    }
}
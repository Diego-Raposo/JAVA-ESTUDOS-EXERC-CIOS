package org.example;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       LocalDate date1 = LocalDate.parse("2022-11-25");
       LocalDateTime date2 = LocalDateTime.parse("2022-07-30T13:55:54");
       Instant date3 = Instant.parse("2022-11-21T02:55:54Z");
       LocalDate date4 = LocalDate.parse("25/12/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

       DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

       DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
       DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
       DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Date3: " + date3);
        System.out.println();
        System.out.println("Date4: " + date4);
        System.out.println("Date1: " + date1.format(fmt1));
        System.out.println("Date2: " + date2.format(fmt2));
        System.out.println("Date3: " + fmt3.format(date3));
        System.out.println();
        System.out.println("Date1: " + date1.format(fmt4));
        System.out.println("Date2: " + date2.format(fmt5));
        System.out.println("Date3: " + fmt6.format(date3));

    }
}
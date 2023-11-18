package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2023-12-19");
        LocalDateTime date2 = LocalDateTime.parse("2023-06-25T12:30:07");
        Instant date3 = Instant.parse("2023-11-12T15:20:08Z");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        LocalDate date4 = LocalDate.parse("12/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate date5 = LocalDate.parse("2023-11-19", DateTimeFormatter.ISO_DATE);


        System.out.println("Date1: " + date1.format(fmt1));
        System.out.println("Date2: " + date2.format(fmt2));
        System.out.println("Date3: " + fmt3.format(date3));
        System.out.println("Date1: " + fmt1.format(date1));
        System.out.println("Date2: " + fmt2.format(date2));
        System.out.println("Date3: " + fmt3.format(date3));
        System.out.println("Date4: " + date4.format(fmt1));
        System.out.println("Date5: " + date5);


    }
}
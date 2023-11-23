package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2022-12-31");
        LocalDateTime date2 = LocalDateTime.parse("1999-12-19T17:30:25");
        Instant date3 = Instant.parse("2005-12-13T01:30:25Z");

        LocalDate r1 = LocalDate.ofInstant(date3,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date3,ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(date3,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date3,ZoneId.of("America/Manaus"));

        System.out.println("Resultado1: " + r1);
        System.out.println("Resultado2: " + r2);
        System.out.println("Resultado3: " + r3);
        System.out.println("Resultado4: " + r4);

        System.out.println("Date1 dia = " + date1.getDayOfMonth());
        System.out.println("Date1 mes = " + date1.getMonth());
        System.out.println("Date1 ano = " + date1.getYear());
        System.out.println("Date1 dia da semana = " + date1.getDayOfWeek());
        System.out.println();
        System.out.println("Date2 dia = " + date2.getYear());
        System.out.println("Date2 mes = " + date2.getMonth());
        System.out.println("Date2 ano = " + date2.getYear());
        System.out.println("Date2 Hora = " + date2.getHour());
        System.out.println("Date2 Minutos = " + date2.getMinute());
    }
}
package org.example;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("22/11/2023");
        Date y2 = sdf2.parse("22/11/2023 18:58:53");

        System.out.println("Date1: " + y1);
        System.out.println("Date2: " + y2);
        System.out.println();
        System.out.println("Date1: " + sdf1.format(y1));
        System.out.println("Date2: " + sdf2.format(y2));
        System.out.println();

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("x5: " + sdf2.format(x5)); // 4 horas a menos (Manaus);

        System.out.println("----UTC----");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("x5: " + sdf3.format(x5));






    }
}
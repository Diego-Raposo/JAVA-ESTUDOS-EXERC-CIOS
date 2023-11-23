package org.example;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2023-11-22T19:29:45Z"));

        System.out.println("Date: " + sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);

        int minutes = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int month = 1 + cal.get(Calendar.MONTH);

        d = cal.getTime();

        System.out.println("DateCal: " + sdf.format(d));
        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + segundos);
        System.out.println("Mês: " + month);
    }
}
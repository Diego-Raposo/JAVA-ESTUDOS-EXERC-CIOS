package org.example;

import java.security.SecureRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequencia = new int[7]; // Array de frequentadores de frequencia
        for(int i=1; i<=6000000; i++){
            ++frequencia[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");

        for(int face = 1; face< frequencia.length; face++){
            System.out.printf("%4d%10d%n", face, frequencia[face]);
        }


    }
}
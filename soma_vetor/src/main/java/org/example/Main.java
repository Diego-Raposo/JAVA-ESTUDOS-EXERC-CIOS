package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        float[] vect = new float[n];
        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextFloat();
        }
        System.out.print("VALORES = ");
        for(int i = 0; i< vect.length; i++){
            System.out.printf("%.2f ", vect[i]);
        }

        float soma = 0.0F;
        for(int i=0; i< vect.length; i++){
            soma += vect[i];
        }
        float media = soma/n;

        System.out.printf("\nMEDIA: %.2f", media);
        System.out.printf("\nSOMA = %.2f", soma);
        input.close();
    }
}
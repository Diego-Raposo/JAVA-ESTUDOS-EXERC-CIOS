package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = input.nextInt();
        double []alturas = new double[n];
        double soma = 0.0;
        int i;
        for (i=0;i<n;i++){
            System.out.printf("Digite a altura da %d pessoa: ", i+1);
            alturas[i] = input.nextDouble();
        }
        for (i=0; i<n; i++) {
            soma += alturas[i];
        }
        double media = soma/n;
        System.out.println();
        System.out.printf("%.2f", media);
        input.close();

    }
}
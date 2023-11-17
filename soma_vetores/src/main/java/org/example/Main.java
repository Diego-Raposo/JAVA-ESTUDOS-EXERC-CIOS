package org.example;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] vectSoma = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for(int i=0; i< vect1.length; i++){
            vect1[i] = input.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i=0; i< vect1.length; i++){
            vect2[i] = input.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for(int i=0; i< vect1.length; i++){
            vectSoma[i] = vect1[i] + vect2[i];
            System.out.println(vectSoma[i]);
        }

        input.close();
    }
}
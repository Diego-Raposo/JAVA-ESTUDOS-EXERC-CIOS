package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares. 
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos número você vai digitar: ");
        int n = input.nextInt();
        int[] vect = new int[n];
        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextInt();
        }
        int cont_par = 0;
        System.out.println("NÚMEROS PARES: ");
        for(int i=0; i< vect.length; i++){
            if(vect[i]%2==0){
                cont_par++;
                System.out.printf("%d ", vect[i]);
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", cont_par);

        input.close();
    }
}
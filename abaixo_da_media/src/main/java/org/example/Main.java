package org.example;

/*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        float[] vect = new float[n];
        float soma = 0.0f;
        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextFloat();
            soma+=vect[i];
        }
        float media = soma/n;
        System.out.printf("MEDIA DO VETOR = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for(int i=0; i< vect.length; i++){
            if(vect[i]<media){
                System.out.println(vect[i]);
            }
        }
        input.close();
    }
}
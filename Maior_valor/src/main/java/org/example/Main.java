package org.example;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        double[] vect = new double[n];
        double maior=vect[0];
        int posicao =  0, i;
        for(i=0; i< vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextDouble();
            if(i==0){
                maior = vect[i];
                posicao = i;
            }else{
                if(vect[i]>maior){
                    maior = vect[i];
                    posicao = i;
                }
            }
        }

        System.out.printf("MAIOR VALOR = %.2f", maior);
        System.out.printf("\nPOSIÇÃO DO MAIOR VALOR = %d", posicao);

        input.close();
    }
}
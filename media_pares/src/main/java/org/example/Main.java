package org.example;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        int[] vect = new int[n];
        int soma=0, contPar=0;
        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextInt();
            if(vect[i]%2==0){
                contPar++;
                soma+=vect[i];
            }
        }
        if(contPar==0){
            System.out.print("NENHUM NUMERO PAR");
        }else{
            float media = (float)soma/contPar;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        input.close();
    }
}
package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar?  ");
        int N = input.nextInt();
        int[] vect = new int[N];
        if(N<=10){
            for (int i=0; i< vect.length; i++){
                input.nextLine();
                System.out.printf("Digite o %d número: ", i+1);
                vect[i] = input.nextInt();
            }
            System.out.println("NÚMEROS NEGATIVOS: ");
            for (int i=0; i<vect.length; i++){
                if(vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }
        }else {
            System.out.printf("Número inválido!! \nDigite um numero menor ou igual a 10. ");
        }


        input.close();


    }
}
package org.example;

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
package org.example;

import java.util.Locale;
import java.util.Scanner;

/*

Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.

*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        double[] alturas = new double[n];
        char[] genero = new char[n];
        double soma_altura_mulheres = 0.0;
        int cont_mulheres = 0, cont_homens=0;
        for(int i=0; i < alturas.length; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = input.nextDouble();
            input.nextLine();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = input.nextLine().charAt(0);
            if(genero[i]== 'F' || genero[i]=='f'){
                soma_altura_mulheres += alturas[i];
                cont_mulheres++;
            } else if (genero[i] == 'm' || genero[i] == 'M') {
                cont_homens++;
            }

        }

        double mediaAlturaMulheres = soma_altura_mulheres/cont_mulheres;
        double maiorAltura=0, menorAltura=0;
        for(int i=0; i< alturas.length; i++){
            if(i==0){
                maiorAltura = alturas[i];
                menorAltura = alturas[i];
            }else if(alturas[i]>maiorAltura){
                maiorAltura = alturas[i];
            } else if (alturas[i]<menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.print("Menor altura: " + menorAltura);
        System.out.print("\nMaior altura: " + maiorAltura);
        System.out.print("\nMedia das alturas das mulheres: " + String.format("%.2f", mediaAlturaMulheres));
        System.out.print("\nNumero de homens: " + cont_homens);

        input.close();
    }
}
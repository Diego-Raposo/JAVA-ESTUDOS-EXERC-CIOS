package org.example;

import java.util.Scanner;

/*

Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.

*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matriz = new int[m][n];
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        int x = input.nextInt();
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] == x){
                    System.out.println("Posição: " + i +":" + j);
                    if(i>0) {
                        System.out.println("Valor de cima: " + matriz[i-1][j]);
                    }
                    if(i+1!=m){
                        System.out.println("Valor de baixo: " + matriz[i+1][j]);
                    }
                    if(j>0){
                        System.out.println("Valor da esquerda: " + matriz[i][j-1]);
                    }
                    if(j+1!=n){
                        System.out.println("Valor da direita: " + matriz[i][j+1]);
                    }
                }
            }
        }
    }
}
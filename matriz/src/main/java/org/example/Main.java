package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] mat = new int[n][n];

        for(int i=0; i< mat.length; i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();

        int cont_negativos=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0;j< mat[i].length;j++){
                if(mat[i][j] < 0){
                    cont_negativos++;
                }
            }
        }

        System.out.printf("Negative numbers = %d", cont_negativos);
        input.close();


    }
}
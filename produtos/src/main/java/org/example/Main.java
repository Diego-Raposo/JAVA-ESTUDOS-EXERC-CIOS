package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n, i ;
        System.out.print("Digite o valor de N: ");
        n = input.nextInt();
        Product[] objProduct = new Product[n];
        for (i=0; i<objProduct.length; i++){
            input.nextLine();
            System.out.printf("\nDigite o nome do produto %d: ", i+1);
            String name = input.nextLine();
            System.out.printf("Digite o preço do produto %d: ", i+1);
            double price = input.nextDouble();
            objProduct[i] = new Product(name, price);
        }
        double soma=0.0;
        for(i=0; i<objProduct.length; i++){
            soma += objProduct[i].getPrice();
        }

        double media = soma/n;
        System.out.printf("Media dos preços: %.2f%n", media);
        input.close();
    }
}
package org.example;

import Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        Pessoa[] pessoa1 = new Pessoa[n];
        for(int i=0; i< pessoa1.length; i++){
            input.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            pessoa1[i] = new Pessoa(nome, idade, altura);
        }
        input.nextLine();
        double somaAltura = 0.0;
        int contPessoaMenor16=0;
        for(int i =0; i< pessoa1.length; i++){
            somaAltura += pessoa1[i].getAltura();
        }
        for(int i =0; i< pessoa1.length; i++){
            if(pessoa1[i].getIdade()<16){
                contPessoaMenor16++;
            }
        }
        double percentPessoaMenor16 = ((double)contPessoaMenor16/n)*100;
        double media = somaAltura/n;
        System.out.printf("Altura média: %.2f", media);
        System.out.print("\nIdade menor que 16: " + percentPessoaMenor16 + "%\n");
        for(int i =0; i< pessoa1.length; i++){
            if(pessoa1[i].getIdade()<16){
                System.out.println(pessoa1[i].getNome());
            }
        }
        input.close();
    }
}
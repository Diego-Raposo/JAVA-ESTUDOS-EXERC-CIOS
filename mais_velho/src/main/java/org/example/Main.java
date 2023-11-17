package org.example;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = input.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        int[] vectIdades = new int[n];
        String[] vectNomes = new String[n];
        for(int i=0; i< pessoas.length; i++){
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.print("\nNome: ");
            input.nextLine();
            String nome = input.nextLine();
            vectNomes[i] = nome;
            System.out.print("Idade: ");
            int idade = input.nextInt();
            vectIdades[i] = idade;
            pessoas[i] = new Pessoa(nome,idade);
        }
        int Idade_mais_velho = 0;
        String pessoa_mais_velha = null;
        for(int i=0; i< pessoas.length; i++){
            if(i==0){
                Idade_mais_velho = pessoas[i].getIdade();
                pessoa_mais_velha = pessoas[i].getNome();
            } else if (pessoas[i].getIdade()>Idade_mais_velho) {
                Idade_mais_velho = pessoas[i].getIdade();
                pessoa_mais_velha = pessoas[i].getNome();
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + pessoa_mais_velha);

        input.close();
    }
}
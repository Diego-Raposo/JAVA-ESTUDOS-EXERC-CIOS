package org.example;

import java.util.Locale;
import java.util.Scanner;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,  sendo esses quartos
identificados pelos números de 0 a 9.

fazer um programa que inicie com todos os 10 quartos vazios, e depois leia
uma quantidade N representando o número de estudantes que vão alugar quartos
(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
Para cada registro de aluguel, informar o nome e email do estudante,
bem como qual dos quartos ele escolheu (de 0 a 9).
Suponha que seja escolhido um quarto vago. Ao final,
seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
* */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados? ");
        int n = input.nextInt();
        aluno[] vect = new aluno[10];
        for(int i=1; i<=n; i++){
            System.out.println("RENT #" + i);
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto: ");
            int numero_quarto = input.nextInt();
            aluno ObjAluno = new aluno(nome, email);
            vect[numero_quarto] =  ObjAluno;
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i=0; i<10 ; i++){
            if(vect[i] != null) {
                System.out.print(i + ": "+ vect[i]);
            }
        }
        input.close();
    }
}
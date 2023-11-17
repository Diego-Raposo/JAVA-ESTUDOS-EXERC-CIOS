package org.example;

import java.util.Locale;
import java.util.Scanner;

/*

Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = input.nextInt();
        Aluno[] alunos = new Aluno[n];
        for(int i=0; i< alunos.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno: \n", i+1);
            input.nextLine();
            String nome = input.nextLine();
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
        }
        System.out.println("Alunos aprovados: ");
        for(int i=0; i< alunos.length; i++){
            if((alunos[i].getNota1() + alunos[i].getNota2())/2 >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }

        input.close();

    }
}
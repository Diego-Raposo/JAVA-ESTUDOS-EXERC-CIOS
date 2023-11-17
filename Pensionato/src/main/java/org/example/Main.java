package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
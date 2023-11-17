package org.example;

// Pesquisa de respostas de 20 alunos
public class Main {
    public static void main(String[] args) {
        int[] vect = {1,2,2,3,2,1,2,3,4,5,2,1,3,4,3,2,3,4,5,14};
        int[] frequencia = new int[6];
        for(int resposta=0; resposta< vect.length; resposta++){
            try {
                ++frequencia[vect[resposta]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("    resposta[%d] = %d%n%n", resposta+1, vect[resposta]);
            }

        }
        System.out.printf("%s%10s%n", "Opções", "  Frequencia");
        // gera saída do valor de cada elemento do array
        for (int opcoes = 1; opcoes < frequencia.length; opcoes++)
             System.out.printf("%6d%10d%n", opcoes, frequencia[opcoes]);

    }
}
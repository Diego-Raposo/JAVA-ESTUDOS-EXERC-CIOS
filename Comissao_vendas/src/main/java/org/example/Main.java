package org.example;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/*
Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por
comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor
que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando
um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
de cada vendedor foi truncado para uma quantia inteira):

a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) R$ 1.000 e acima
Resuma os resultados em formato tabular.

*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Número de vendedores: ");
        int salario_fixo = 200;
        double taxa_comissao = 0.09;
        int num = input.nextInt();
        int vendas = 0;
        double comissao = 0;
        int[] vect = new int[num];
        input.nextLine();
        for(int i=0; i< vect.length; i++){
            System.out.print("Digite o total de vendas do " + (i+1)+"a" + " vendedor(a) em (R$): ");
            vendas = input.nextInt();
            comissao = vendas*taxa_comissao;
            vect[i] = (int)(salario_fixo + comissao);
        }
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        int cont7 = 0;
        int cont8 = 0;
        int cont9 = 0;

        for(int i=0; i<vect.length; i++){
            if(vect[i]>=200 && vect[i]<299){
                cont1++;
            }
            if(vect[i]>=300 && vect[i]<399){
                cont2++;
            }
            if(vect[i]>=400 && vect[i]<499){
                cont3++;
            }
            if(vect[i]>=500 && vect[i]<599){
                cont4++;
            }
            if(vect[i]>=600 && vect[i]<699){
                cont5++;
            }
            if(vect[i]>=700 && vect[i]<799){
                cont6++;
            }
            if(vect[i]>=800 && vect[i]<899){
                cont7++;
            }
            if(vect[i]>=900 && vect[i]<999){
                cont8++;
            }
            if(vect[i]>=1000){
                cont9++;
            }
        }

        System.out.println();
        System.out.println("Visualzação de Salários: ");
        System.out.println();
        for(int i =0; i<vect.length; i++){
            System.out.println("Salario " + (i+1)+"º funcionário : "+ vect[i]);
        }

        System.out.println();
        System.out.println("---- Tabela de Salários ----");
        System.out.println();
        System.out.println("Min - Total: (nº)funcionários ");
        System.out.println("200 - 299: "+ cont1);
        System.out.println("300 - 399: "+ cont2);
        System.out.println("400 - 499: "+ cont3);
        System.out.println("500 - 599: "+ cont4);
        System.out.println("600 - 699: "+ cont5);
        System.out.println("700 - 799: "+ cont6);
        System.out.println("800 - 899: "+ cont7);
        System.out.println("900 - 999: "+ cont8);
        System.out.println("1000 ou mais: "+ cont9);






        input.close();

    }
}
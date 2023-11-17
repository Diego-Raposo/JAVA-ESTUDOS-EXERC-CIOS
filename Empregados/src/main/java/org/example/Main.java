package org.example;

import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos funcionários serão registrados? ");
        int n = input.nextInt();
        List<Employee> funcionarios = new ArrayList<>();
        for(int i = 0; i<n; i++){
            System.out.println();
            System.out.println("Funcionário #" + (i+1));
            System.out.print("Id: ");
            Integer id = input.nextInt();
            while(hasId(funcionarios, id)){
                System.out.print("O id digitado já existe! Tente novamente: ");
                id = input.nextInt();
            }
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Salário: ");
            Double salario = input.nextDouble();
            Employee objFuncionario = new Employee(id, nome, salario);
            funcionarios.add(objFuncionario);
            input.nextLine();
        }
        System.out.println();
        System.out.print("Entre com o id da funcionário que terá o salário aumentado: ");
        int idx = input.nextInt();

        Employee emp = funcionarios.stream().filter(x -> x.getId() == idx).findFirst().orElse(null);
        if(emp == null){
            System.out.println("O id digitado não existe!");
        }else{
            System.out.print("Digite a porcentagem de aumento salarial: ");
            double percent = input.nextDouble();
            emp.AumentaSalario(percent);
        }


       /*

       for(Employee funcionario:funcionarios){
            if(idx == funcionario.getId()){
                System.out.print("Digite a porcentagem de aumento salarial: ");
                double percent = input.nextDouble();
                funcionario.AumentaSalario(percent);
            }
        }
       */
        System.out.println();
        System.out.println("Lista de Funcionários: ");
        System.out.println("----------");
        for(Employee funcionario:funcionarios) {
            System.out.println(funcionario);
        }



        input.close();
    }


    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;

    }
}
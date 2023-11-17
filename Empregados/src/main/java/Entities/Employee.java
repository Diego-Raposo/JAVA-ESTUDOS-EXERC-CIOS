package Entities;

public class Employee {
    private Integer id;
    private String nome;
    private Double salario;


    public Employee(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double AumentaSalario(Double percent){
        return salario += (percent*getSalario())/100;
    }

    @Override
    public String toString(){
        return "id: " + getId()
                + "\nNome: " + getNome()
                + "\nSalário: " + String.format("%.2f", getSalario()) + "\n" + "----------";
    }

}

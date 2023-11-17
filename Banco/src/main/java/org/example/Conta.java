package org.example;

public class Conta {

    private int numberConta;
    private String name;
    private double balance;

    public Conta() {

    }

    public Conta(int numberConta, String name, double depositInitial) {
        this.numberConta = numberConta;
        this.name = name;
        DepositaValor(depositInitial);
    }
    public Conta(int numberConta, String name) {
        this.numberConta = numberConta;
        this.name = name;
    }

    public int getNumberConta() {
        return numberConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account " + getNumberConta()
                + ", holder: " + getName()
                + ", Balance: $ " + String.format("%.2f", getBalance());
    }

    public void DepositaValor(double value) {
        balance += value;
    }

    public void SaqueValor(double value) {
        balance -= value + 5;
    }

}

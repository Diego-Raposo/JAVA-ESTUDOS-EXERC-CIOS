package org.example;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo() {
        super("Triangulo");
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }


}
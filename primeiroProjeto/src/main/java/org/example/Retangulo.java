package org.example;

public class Retangulo extends FiguraGeometrica{
    private float base;
    private float altura;

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public  Retangulo() {
        super("Retangulo");
    }
}


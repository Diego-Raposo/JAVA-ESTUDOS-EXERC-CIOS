package org.example;

public abstract class FiguraGeometrica {
    private String name;

    protected FiguraGeometrica(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculaArea() {
        return -1;
    }

}

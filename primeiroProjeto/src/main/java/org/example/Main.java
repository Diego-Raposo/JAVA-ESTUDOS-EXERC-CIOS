package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Triangulo objTriangulo;
        objTriangulo = new Triangulo();
        objTriangulo.setBase(4f);
        objTriangulo.setAltura(5f);
        System.out.println("Nome: " + objTriangulo.getName());
        System.out.println("Base: " + objTriangulo.getBase());
        System.out.println("Altura: " + objTriangulo.getAltura());
        System.out.println();
        Retangulo objRetangulo = new Retangulo();
        objRetangulo.setBase(6f);
        objRetangulo.setAltura(8f);
        System.out.println("Nome: " + objRetangulo.getName());
        System.out.println("Base: " + objRetangulo.getBase());
        System.out.println("Altura: " + objRetangulo.getAltura());

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
    }
}
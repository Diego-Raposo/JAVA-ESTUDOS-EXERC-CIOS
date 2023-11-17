package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] Array = new int[]{0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Distribuição de notas: ");
        for(int i=0; i< Array.length; i++){
            if(i<10){
                System.out.printf("%02d-%02d: ", i*10, i*10 + 9);
            }else{
                System.out.printf("%5d: ", i*10);

            }
            for(int stars=0; stars<Array[i]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
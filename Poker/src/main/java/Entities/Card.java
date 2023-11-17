package Entities;

public class Card {
    private final String face;
    private final String naipe;

    public Card(String face, String naipe){
        this.face = face;
        this.naipe = naipe;
    }

    public String toString(){
        return face + " de " + naipe;
    }

}

package Entities;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NumberOfCards = 52;
    private static final SecureRandom randomNumbers = new SecureRandom(); //Gerador aleátorio de numeros;

    public DeckOfCards(){
        String[] faces = {"Ás", "dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};
        String[] naipe = {"Espadas", "Paus", "Copas", "Ouro"};

        deck = new Card[NumberOfCards]; // Cria Array de objetos cards
        currentCard = 0; // A primeira carta distribuída será o deck[0]

//        Preenche o baralho com objetos Cards
        for(int i = 0; i<deck.length; i++){
            deck[i] = new Card(faces[i%13], naipe[i/13]);
        }

    }
    public void shuffle() {
        currentCard = 0;
        for(int first = 0; first< deck.length; first++){
            int second = randomNumbers.nextInt(NumberOfCards);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }
        else{
            return null;
        }
    }

}

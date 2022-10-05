package Card;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck =new Stack<>();
    private int[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private char[] suits = {'♥', '♦', '♠', '♣'};

    public Deck(){
        createDeck();
        shuffle();
    }

    public Card drawCard(){
        return deck.pop();
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }


    //Creates the deck of cards and ads them to the stack.
    private void createDeck(){
            for (int rank: ranks){
                for (char suit: suits){
                    deck.add(new Card(rank, suit));
                }
            }
        }
}

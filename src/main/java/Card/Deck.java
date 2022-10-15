package Card;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck =new Stack<>();
    private Rank[] ranks = {Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE,
            Rank.TEN, Rank.J, Rank.Q, Rank.K, Rank.A};
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
            for (Rank rank: ranks){
                for (char suit: suits){
                    deck.add(new Card(rank, suit));
                }
            }
        }
}

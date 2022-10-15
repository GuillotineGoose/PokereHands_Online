package Card;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck =new Stack<>();

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
            for (Rank rank: Rank.values()){
                for (Suit suit: Suit.values()){
                    deck.add(new Card(rank, suit));
                }
            }
        }

    @Override
    public String toString() {
        return deck.toString();
    }
}

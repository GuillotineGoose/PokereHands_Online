package Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck =new ArrayList<>();

    public Deck(){
        createDeck();
        shuffle();
    }

    public Card drawCard(){
        if(deck.size() > 0){
        var card = deck.get(0);
        deck.remove(0);
        return card;
        } else {
            return null;
        }
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

    public int size(){
        return deck.size();
    }
}

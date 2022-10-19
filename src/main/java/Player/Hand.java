package Player;

import Card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hand {
    List<Card> hand; //This will be the two cards unique to the player


    public Hand(){
        hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }



}

package Player;

import Card.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerHand {
    private List<Card> hand;

    private PokerHands score;
    private Rank highCard;

    private Map<Rank, List<Card>> handValues;

    public PokerHand(){
        hand = new ArrayList<>();
        handValues = new HashMap<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }


    public void checkIfStraightFlush(){

    }
    public void checkIfFourOfAKind(){

    }
    public void checkIfFullHouse(){

    }
    public void checkIfFlush(){

    }
    public void checkIfStraight(){

    }
    public void checkIfThreeOfAKind(){

    }
    public void checkIfTwoPairs(){

    }
    public void checkIfPair(){

    }

    public void checkHighCard(){

    }

    public PokerHands getScore() {
        return null;
    }

    public Rank getHighCard() {
        return null;
    }
}

package Player;

import Card.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    private PokerHand hand;
    @BeforeEach
    public void initTest(){
        hand = new PokerHand();
    }

    @Test
    public void tieBreakerWithoutTest(){

        hand.addCard(new Card(8, '♥'));
        hand.addCard(new Card(4, '♣'));
        hand.addCard(new Card(2, '♦'));
        hand.addCard(new Card(14, '♠'));
        hand.addCard(new Card(10, '♠'));

        assertEquals(14, hand.getTiebreaker());
    }

    @Test
    public void tieBreakerWithTest(){
        hand.addCard(new Card(8, '♥'));
        hand.addCard(new Card(4, '♣'));
        hand.addCard(new Card(2, '♦'));
        hand.addCard(new Card(14, '♠'));
        hand.addCard(new Card(10, '♠'));

        int[] test = {14, 10};
        assertEquals(8, hand.getTiebreaker(test));
    }

    @Test
    public void pairTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(9, '♣'));
        hand.addCard(new Card(8, '♦'));
        hand.addCard(new Card(9, '♠'));
        hand.addCard(new Card(7, '♠'));

        assertEquals(9, hand.getPair());

    }

    @Test
    public void twoPairTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(9, '♣'));
        hand.addCard(new Card(7, '♦'));
        hand.addCard(new Card(9, '♠'));
        hand.addCard(new Card(7, '♠'));


        var pair = hand.getTwoPair();

        assertEquals(7, pair[0]);
        assertEquals(9, pair[1]);
    }

    @Test
    public void threeOfAKindTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(9, '♣'));
        hand.addCard(new Card(9, '♦'));
        hand.addCard(new Card(9, '♠'));
        hand.addCard(new Card(7, '♠'));

        assertEquals(9, hand.getThreeOfAKind());

    }

    @Test
    public void fullHouseTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(9, '♣'));
        hand.addCard(new Card(9, '♦'));
        hand.addCard(new Card(9, '♠'));
        hand.addCard(new Card(4, '♠'));

        var fullHouse = hand.getFullhouse();

        assertEquals(9, fullHouse[0]);
        assertEquals(4, fullHouse[1]);
    }

    @Test
    public void straightTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(3, '♣'));
        hand.addCard(new Card(6, '♦'));
        hand.addCard(new Card(5, '♠'));
        hand.addCard(new Card(7, '♠'));

        assertEquals(7, hand.getStraight());
    }

    @Test
    public void flushTest(){
        hand.addCard(new Card(4, '♥'));
        hand.addCard(new Card(2, '♥'));
        hand.addCard(new Card(5, '♥'));
        hand.addCard(new Card(6, '♥'));
        hand.addCard(new Card(7, '♥'));

        assertEquals(7, hand.getFlush());
    }

    @Test
    public void fourOfAKindTest(){
        hand.addCard(new Card(6, '♠'));
        hand.addCard(new Card(6, '♥'));
        hand.addCard(new Card(6, '♥'));
        hand.addCard(new Card(6, '♥'));
        hand.addCard(new Card(7, '♥'));

        assertEquals(6, hand.getFourOfAKind());
    }


}

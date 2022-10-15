/*
package Player;

import Card.Card;
import Card.Rank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    private PokerHand hand;
    private List<Card> board;


    @BeforeEach
    public void initTest(){
        hand = new PokerHand();
        board = new List<Card>;
    }

    @Test
    public void tieBreakerWithoutTest(){

        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(14, hand.getTiebreaker());
    }

    @Test
    public void tieBreakerWithTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        int[] test = {14, 10};
        assertEquals(8, hand.getTiebreaker(test));
    }

    @Test
    public void pairTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(9, hand.getPair());

    }

    @Test
    public void twoPairTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));


        var pair = hand.getTwoPair();

        assertEquals(7, pair[0]);
        assertEquals(9, pair[1]);
    }

    @Test
    public void threeOfAKindTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(9, hand.getThreeOfAKind());

    }

    @Test
    public void fullHouseTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        var fullHouse = hand.getFullhouse();

        assertEquals(9, fullHouse[0]);
        assertEquals(4, fullHouse[1]);
    }

    @Test
    public void straightTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(7, hand.getStraight());
    }

    @Test
    public void flushTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(7, hand.getFlush());
    }

    @Test
    public void fourOfAKindTest(){
        hand.addCard(new Card(Rank.TWO, '♥'));
        hand.addCard(new Card(Rank.THREE, '♣'));

        board.add(new Card(Rank.FIVE, '♠'));
        board.add(new Card(Rank.J, '♠'));
        board.add(new Card(Rank.Q, '♠'));
        board.add(new Card(Rank.K, '♠'));
        board.add(new Card(Rank.A, '♠'));

        assertEquals(6, hand.getFourOfAKind());
    }


}
*/


package Player;

import Card.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerScoreTest {
    private PokerHand player;

    @BeforeEach
    void setUp() {
        player = new PokerHand();
    }

    @Test
    void checkHighCard(){

        player.addCard(new Card(Rank.FIVE, Suit.CLUBS));
        player.addCard(new Card(Rank.J, Suit.SPADES));
        player.addCard(new Card(Rank.TEN, Suit.SPADES));
        player.addCard(new Card(Rank.K, Suit.HEARTS));
        player.addCard(new Card(Rank.A, Suit.CLUBS));

        player.setScore();

        assertEquals(Score.HIGH_CARD, player.getScore());
        assertEquals(Rank.K, player.getHighCard());


    }
}
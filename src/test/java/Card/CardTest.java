package Card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {
    @Test
    public void getRankTest(){
        var card = new Card(Rank.TEN, Suit.DIAMONDS);
        assertEquals(Rank.TEN, card.getRank());
    }

    @Test
    public void getSuitTest(){
        var card = new Card(Rank.TEN, Suit.DIAMONDS);
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }
}

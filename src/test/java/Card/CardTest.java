package Card;

import Card.Card;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {
    @Test
    public void getRankTest(){
        var card = new Card(2, '♥');
        assertEquals(2, card.getRank());
    }

    public void getSuitTest(){
        var card = new Card(2,'♥');
        assertEquals('♥', card.getSuit());
    }
}

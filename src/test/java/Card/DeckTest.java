package Card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DeckTest {
    private Deck deck;

    @BeforeEach
    public void initTest(){
        deck = new Deck();
    }

    @Test
    public void drawACard(){
        var orgSize = deck.size();
        deck.drawCard();

        assertEquals(orgSize - 1, deck.size());
    }

    @Test
    public void shuffle(){
        String previousDeck = deck.toString();
        assertEquals(previousDeck, deck.toString());
        deck.shuffle();

        assertNotEquals(previousDeck, deck.toString());
    }


    @Test void drawWholeDeck(){
        deck.drawCard();

        assertEquals(0, deck.size());

    }

    @Test
    public void drawToManyCards(){
        for (int i = 0; i<54; i++) {
            deck.drawCard();
        }

        assertEquals(0, deck.size());

    }
}

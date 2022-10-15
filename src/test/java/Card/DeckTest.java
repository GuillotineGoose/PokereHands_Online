package Card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    private Deck deck;

    @BeforeEach
    public void initTest(){
        deck = new Deck();
    }

    @Test
    public void drawACard(){
        var orgSize = deck.getDeck().size();
        deck.drawCard();

        assertEquals(orgSize - 1, deck.getDeck().size());
    }

    /*@Test void drawWholeDeck(){

    }

    @Test
    public void drawToManyCards(){

    }*/
}

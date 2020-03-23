import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void deckStartsWithFiftyTwoCards(){
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void cardsCanBeTakenFromDeck(){
        deck.dealOne();
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void twoCardsCanBeTakenFromDeck(){
        deck.dealOne();
        deck.dealOne();
        assertEquals(50,deck.cardCount());
    }
}

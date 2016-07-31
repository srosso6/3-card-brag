import game_management.*;
// import java.util.ArrayList;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(SuitType.CLUB, CardType.TWO);
  }

  @Test
  public void deckHas52Cards(){
    assertEquals(52, deck.getSize());
  }

  @Test
  public void canRemoveTopCard(){
    deck.removeTopCard();
    assertEquals(51, deck.getSize());
  }

  @Test
  public void topCardIsClub() {
    assertEquals(card.getSuit(), deck.removeTopCard().getSuit());
  }

  @Test
  public void topCardIsKing() {
    assertEquals(card.getValue(), deck.removeTopCard().getValue());
  }

  @Test
  public void canBeShuffled() {
    ArrayList<Card> preShuffle = new ArrayList<Card>(deck.getCards());
    deck.shuffle();
    ArrayList<Card> postShuffle = deck.getCards();
    assertThat(preShuffle, is(not(equalTo(postShuffle))));
  }

}

import game_management.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.CLUB, CardType.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(card.getSuit(), SuitType.CLUB);
  }

  @Test
  public void canGetValue(){
    assertEquals(card.getValue(), CardType.ACE);
  }

}

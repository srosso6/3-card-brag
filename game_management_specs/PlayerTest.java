import game_management.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player;
  Card aC;
  Card qC;
  Card kC;
  Card twoC;

  @Before
  public void before(){
    player = new Player("Bex");
    aC = new Card(SuitType.CLUB, CardType.ACE);
    qC = new Card(SuitType.CLUB, CardType.QUEEN);
    kC = new Card(SuitType.CLUB, CardType.KING);
    twoC = new Card(SuitType.CLUB, CardType.TWO);
  }

  @Test
  public void canGetName(){
    assertEquals("Bex", player.getName());
  }

  @Test
  public void canAcceptCard(){
    player.acceptCard(aC);
    assertEquals(1, player.getNumberOfCards());
  }

  @Test
  public void canFillHand(){
    player.acceptCard(aC);
    player.acceptCard(qC);
    player.acceptCard(kC);
    assertEquals(3, player.getNumberOfCards());
  }

  @Test
  public void doesNotAcceptFourthCard() {
    player.acceptCard(aC);
    player.acceptCard(qC);
    player.acceptCard(kC);
    player.acceptCard(twoC);
    assertEquals(3, player.getNumberOfCards());
  }

  @Test
  public void canGetHandScore(){
    player.acceptCard(aC);
    player.acceptCard(qC);
    player.acceptCard(kC);
    assertEquals(5, player.getHandScore());
  }


}

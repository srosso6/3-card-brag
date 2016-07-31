import game_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GameTest {

  Game game;

  @Before
  public void before(){

    Player player1 = new Player("Bex");
    Player player2 = new Player("Zak");
    Player player3 = new Player("Seumus");
    Player player4 = new Player("Harry");


    ArrayList<Player> players = new ArrayList<Player>(
      Arrays.asList(player1,player2,player3,player4)
    );

    Deck deck = new Deck();

    game = new Game(players, deck);

  }

  @Test
  public void canGetNumberOfPlayers(){
    assertEquals(4, game.getNumberOfPlayers());
  }

  // @Test
  // public void canGetPlayerScores() {
  //   assertEquals(int[] scores {}, game.getPlayerScores());
  // }

}

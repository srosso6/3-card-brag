import game_management.*;
import java.util.*;
// import java.util.Formatter;

public class Main {

  public static void main(String[] args) {

    Player player1 = new Player("Bex");
    Player player2 = new Player("Zak");
    Player player3 = new Player("Seumus");
    Player player4 = new Player("Harry");

    ArrayList<Player> players = new ArrayList<Player>(
      Arrays.asList(player1, player2, player3, player4)
    );

    Deck deck = new Deck();

    Game game = new Game(players, deck);

    game.deal();

    for(Player player : players) {

      String playerHas = String.format("%1$s has: ", player.getName());
      System.out.println(playerHas);

      Card[] cards = player.getCards();
      for(Card card : cards) {
        String listCards = String.format("%1$s of %2$ss", card.getValueAsString(), card.getSuitAsString());
        System.out.println(listCards);
      }
    }

    



  }

}

package game_management;
import java.util.ArrayList;

public class Game {

  private ArrayList<Player> players;
  private Deck deck;

  public Game(ArrayList<Player> players, Deck deck) {
    this.players = players;
    this.deck = deck;
  }

  public int getNumberOfPlayers() {
    return players.size();
  }

  public void deal() {
    deck.shuffle();
    for(int i=0; i<3; i++) {
      for(Player player : players) {
        Card card = deck.removeTopCard();
        player.acceptCard(card);
      }
    }
  }

  public int[] getPlayerScores() {
    int[] scores = new int[getNumberOfPlayers()];
    for(int i=0; i<players.size(); i++) {
      scores[i] = players.get(i).getHandScore();
    }
    return scores;
  }

  public void winner() {

  }

}

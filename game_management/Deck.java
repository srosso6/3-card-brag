package game_management;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

  private ArrayList<Card> cards;
  private SuitType[] suits;
  private CardType[] values;

  public Deck() {
    cards = new ArrayList<Card>();
    values = CardType.values();
    suits = SuitType.values();

    for(SuitType suit : suits) {
      for(CardType value : values) {
        Card card = new Card(suit, value);
        cards.add(card);
      }
    }
  }

  public int getSize() {
    return cards.size();
  }

  public ArrayList<Card> getCards() {
    return cards;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card removeTopCard() {
    return cards.remove(0);
  }

}

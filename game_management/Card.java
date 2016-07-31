package game_management;

public class Card {

  private SuitType suit;
  private CardType value;

  public Card(SuitType suit, CardType value) {
    this.suit = suit;
    this.value = value;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public CardType getValue() {
    return this.value;
  }

  public String getSuitAsString() {
    String suit = this.suit.name();
    String suitCapFirst = suit.substring(0,1) + suit.substring(1).toLowerCase();
    return suitCapFirst;
  }

  public String getValueAsString() {
    String value = this.value.name();
    String valueCapFirst = value.substring(0,1) + value.substring(1).toLowerCase();
    return valueCapFirst;
  }

}

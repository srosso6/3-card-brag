package game_management;

public class Player {

  private String name;
  private Card[] cards;

  public Player(String name) {
    this.name = name;
    this.cards = new Card[3];
  }

  public String getName() {
    return this.name;
  }

  public int getHandScore() {
    Hand hand = new Hand(this.cards);
    return hand.score();
  }

  public int getNumberOfCards() {
    if(cards[0] != null) {
      if(cards[1] != null) {
        if(cards[2] != null) {
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }


  public void acceptCard(Card card) {
    switch (getNumberOfCards()) {
      case 3:
        break;
      case 2:
        cards[2] = card;
        break;
      case 1:
        cards[1] = card;
        break;
      case 0:
        cards[0] = card;
        break;
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

}

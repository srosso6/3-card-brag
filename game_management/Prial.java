import game_management.*;

public class Prial extends Hand {

  public Prial(Card[] cards) {
    super(cards);
  }

  public boolean isPrial() {
    int numSameCards = sameValue();
    if (numSameCards == 3) {
      return true;
    }
    return false;
  }

  public int getValueOfPrialCard() {
    int[] values = getArrayOfValues();
    return values[0];
  }

  public int score() {
    int score = 6 + getValueOfPrialCard();
  }

}

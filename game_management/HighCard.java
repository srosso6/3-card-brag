import game_management.*;

public class HighCard extends Hand {

  public HighCard(Card[] cards) {
    super(cards);
  }

  public boolean isHighCardHand() {
    if (!sameValue(); && !sameSuit() && !consecutive()) {
      return true;
    }
    return false;
  }

  public int getSortedValues() {
    int[] values = getArrayOfValues();
    sortBy(values);
  }

  public int getValueOfHighestCard() {
    int[] values = getSortedValues();
    return values[2];
  }

  public int getValueOfSecondHighestCard() {
    int[] values = getSortedValues();
    return values[1];
  }

  public int getValueOfThirdHighestCard() {
    int[] values = getSortedValues();
    return values[0];
  }

  public int score() {
    int score = 1 + getValueOfHighestCard();
  }

}

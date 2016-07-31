import game_management.*;

public class Pair extends Hand {

  public Pair(Card[] cards) {
    super(cards);
  }

  public boolean isPair() {
    int numSameCards = sameValue();
    if (numSameCards == 2) {
      return true;
    }
    return false;
  }

  public int getSortedValues() {
    int[] values = getArrayOfValues();
    sortBy(values);
  }

  public int getValueOfPairCard() {
    int[] values = getSortedValues();
    if(values[0] == values[1] || values[0] == values[2]) {
      return values[0];
    }
    return values[1];
  }

  public int getValueOfOddCard() {
    int[] values = getSortedValues();
    if(values[0] == values[1]) {
      return values[2];
    } else if(values[0] == values[2]) {
      return values[1];
    }
    return values[0];
  }

  public int score() {
    int score = 2 + getValueOfPairCard();
  }

}

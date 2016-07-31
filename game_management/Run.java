import game_management.*;

public class Run extends Hand {

  public Run(Card[] cards) {
    super(cards);
  }

  public boolean isRunHand() {
    if (!sameValue() && !sameSuit() && consecutive()) {
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
    if(values[2] == 3) {
      return 13;
    }
    return 3;
  }

  public int score() {
    int score = 4 + getValueOfHighestCard();
  }

}

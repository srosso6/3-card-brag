import game_management.*;

public class RunningFlush extends Hand {

  public RunningFlush(Card[] cards) {
    super(cards);
  }

  public boolean isRunningFlushHand() {
    if (!sameValue() && sameSuit() && consecutive()) {
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
    int score = 5 + getValueOfHighestCard();
  }

}

package game_management;
import java.util.*;

public class Hand {

  private Card[] cards;

  public Hand(Card[] cards) {
    this.cards = cards;
  }

  public Hand(Card card1, Card card2, Card card3) {
    this.cards = new Card[3];
    cards[0] = card1;
    cards[1] = card2;
    cards[2] = card3;
  }

  public int sameValue() {
    if(cards[0].getValue() == cards[1].getValue() && cards[0].getValue() == cards[2].getValue()) {
      return 3;
    } else if (cards[0].getValue() == cards[1].getValue() || cards[0].getValue() == cards[2].getValue()) {
      return 2;
    } else {
      return 0;
    }
  }

  public boolean sameSuit() {
    if(cards[0].getSuit() == cards[1].getSuit() && cards[0].getSuit() == cards[2].getSuit()) {
      return true;
    }
    return false;
  }

  public int[] getArrayOfValues() {
    int[] values = new int[3];
    for(int i=0; i<cards.length; i++) {
      int value = cards[i].getValue().ordinal();
      values[i] = value + 1;
    }
    return values;
  }

  public int[] sortBy(int[] values) {
    Arrays.sort(values);
    return values;
  }

  public boolean isConsecutive(int[] values) {
    sortBy(values);
    if(values[2] == values[1]+1 && values[2] == values[0]+2) {
      return true;
    }
    return false;
  }

  public boolean consecutive() {
    int[] values = getArrayOfValues();
    if(isConsecutive(values)) {
      return true;
    } else if(values[0] == 1) {
      values[0] = 14;
      if(isConsecutive(values)) {
        return true;
      }
    }
    return false;
  }

  public int score() {
    int numCardsSame = sameValue();
    switch (numCardsSame) {
      case 3: return 6;
      case 2: return 2;
      case 0: if(sameSuit() && consecutive()) {
        return 5;
      } else if(sameSuit()) {
        return 3;
      } else if(consecutive()) {
        return 4;
      }
    }
    return 1;
  }

}

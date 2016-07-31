import game_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class HandTest {

  Hand prial;
  Hand runningFlushHigh;
  Hand runningFlushLow;
  Hand runHigh;
  Hand runLow;
  Hand flush;
  Hand pair;
  Hand highCard;

  @Before
  public void before(){

    Card kC = new Card(SuitType.CLUB, CardType.KING);
    Card kD = new Card(SuitType.DIAMOND, CardType.KING);
    Card kS = new Card(SuitType.SPADE, CardType.KING);
    Card aS = new Card(SuitType.SPADE, CardType.ACE);
    Card qS = new Card(SuitType.SPADE, CardType.QUEEN);
    Card twoS = new Card(SuitType.SPADE, CardType.TWO);
    Card threeS = new Card(SuitType.SPADE, CardType.THREE);
    Card twoH = new Card(SuitType.HEART, CardType.TWO);
    Card threeH = new Card(SuitType.HEART, CardType.THREE);
    Card qH = new Card(SuitType.HEART, CardType.QUEEN);

    prial = new Prial(kC, kD, kS);
    runningFlushHigh = new RunningFlush(kS, aS, qS);
    runningFlushLow = new RunningFlush(twoS, aS, threeS);
    runHigh = new Run(aS, qH, kC);
    runLow = new Run(aS, threeH, twoH);
    flush = new Flush(aS, threeS, qS);
    pair = new Pair(kC, kD, twoS);
    highCard = new HighCard(aS, threeS, qH);
  }

  @Test
  public void canCheckIfPair(){
    assertEquals(2, pair.sameValue());
  }

  @Test
  public void canCheckIfPrial(){
    assertEquals(3, prial.sameValue());
  }

  @Test
  public void canCheckNotPairOrPrial(){
    assertEquals(0, highCard.sameValue());
  }

  @Test
  public void canCheckIfCardsAreSameSuit(){
    assertEquals(true, flush.sameSuit());
  }

  @Test
  public void canCheckIfCardsAreNotSameSuit(){
    assertEquals(false, runLow.sameSuit());
  }

  @Test
  public void canGetArrayOfHandValues(){
    assertArrayEquals(new int[] {1, 13, 2}, runningFlushLow.getArrayOfValues());
  }

  @Test
  public void canSortArrayOfHandValues(){
    int[] values = runningFlushHigh.getArrayOfValues();
    assertArrayEquals(new int[] {11, 12, 13}, runningFlushLow.sortBy(values));
  }

  @Test
  public void canCheckIfCardsAreConsecutiveAceHigh(){
    assertEquals(true, runningFlushHigh.consecutive());
  }

  @Test
  public void canCheckIfCardsAreConsecutiveAceLow(){
    assertEquals(true, runningFlushLow.consecutive());
  }

  @Test
  public void canCheckCardsAreNotConsecutive(){
    assertEquals(false, pair.consecutive());
  }

  @Test
  public void 

  // @Test
  // public void canIdentifyPrial() {
  //   assertEquals(6, prial.score());
  // }
  //
  // @Test
  // public void canIdentifyRunningFlushHigh() {
  //   assertEquals(5, runningFlushHigh.score());
  // }
  //
  // @Test
  // public void canIdentifyRunningFlushLow() {
  //   assertEquals(5, runningFlushLow.score());
  // }
  //
  // @Test
  // public void canIdentifyRunHigh() {
  //   assertEquals(4, runHigh.score());
  // }
  //
  // @Test
  // public void canIdentifyRunLow() {
  //   assertEquals(4, runLow.score());
  // }
  //
  // @Test
  // public void canIdentifyFlush() {
  //   assertEquals(3, flush.score());
  // }
  //
  // @Test
  // public void canIdentifyPair() {
  //   assertEquals(2, pair.score());
  // }
  //
  // @Test
  // public void canIdentifyHighCard() {
  //   assertEquals(1, highCard.score());
  // }

}

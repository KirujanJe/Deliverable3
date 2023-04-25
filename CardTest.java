/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carte
 */
public class CardTest {

    
    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValueGood() {
    System.out.println("Test getValue Good");
    Card instance = new Card(Card.Value.SEVEN, Card.Suit.HEARTS); // create a new Card instance with a known value and suit
    Card.Value expResult = Card.Value.SEVEN; // set the expected result to the known value
    Card.Value result = instance.getValue();
    assertEquals(expResult, result); // assert that the actual result matches the expected result
}
    @Test
    public void testGetValueBad() {
    System.out.println("Test getValue Bad");
    Card instance = new Card(Card.Value.ACE, Card.Suit.SPADES); // create a card with a known value
    Card.Value expResult = Card.Value.KING; // set the expected value to something different
    Card.Value result = Card.Value.QUEEN; // set the actual value to something different
    assertNotEquals(expResult, instance.getValue()); // check that the expected value is not equal to the actual value
    assertNotEquals(result, instance.getValue()); // check that the actual value is not equal to the value of the card instance
}

     @Test
    public void testGetValueBoundary() {
    System.out.println("Test getValue Boundary");
    Card instance = new Card(Card.Value.ACE, Card.Suit.CLUBS); // set value to the lowest possible value
    Card.Value expResult = Card.Value.ACE;
    Card.Value result = instance.getValue();
    assertEquals(expResult, result);
}
    
    
    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuitGood() {
    System.out.println("Test getSuit Good");
    Card instance = new Card(Card.Value.ACE, Card.Suit.HEARTS);
    Card.Suit expResult = Card.Suit.HEARTS;
    Card.Suit result = instance.getSuit();
    assertEquals(expResult, result);
}
    @Test
    public void testGetSuitBad() {
    System.out.println("Test getSuit Bad");
    Card instance = new Card(Card.Value.ACE, Card.Suit.DIAMONDS);
    Card.Suit expResult = Card.Suit.SPADES; // set an expected suit that is different from the actual suit
    Card.Suit result = Card.Suit.CLUBS; // set the actual suit to something different
    assertNotEquals(expResult, instance.getSuit()); // check that the expected suit is not equal to the actual suit of the card instance
    assertNotEquals(result, instance.getSuit()); // check that the actual suit is not equal to the suit of the card instance
}


    @Test
    public void testGetSuitBoundary() {
    System.out.println("Test getSuit Boundary");
    Card instance = new Card(Card.Value.ACE, Card.Suit.SPADES);
    Card.Suit expResult = Card.Suit.SPADES;
    Card.Suit result = instance.getSuit();
    assertEquals(expResult, result);
}
    

    /**
     * Test of generateRandomCard method, of class Card.
     */
    @Test
    public void testGenerateRandomCardGood() {
    System.out.println("Test generateRandomCard Good");
    Card result = Card.generateRandomCard();
    assertTrue(result.getValue().compareTo(Card.Value.ACE) >= 0 
               && result.getValue().compareTo(Card.Value.KING) <= 0);
    assertTrue(result.getSuit().compareTo(Card.Suit.HEARTS) >= 0 
               && result.getSuit().compareTo(Card.Suit.CLUBS) <= 0);
}
    @Test
    public void testGenerateRandomCardBad() {
    System.out.println("Test generateRandomCard Bad");
    Card result = new Card(Card.Value.FIVE, Card.Suit.HEARTS);
    Card.Value expValue = Card.Value.KING; // set an expected value that is different from the actual value
    Card.Value valueResult = Card.Value.ACE; // set the actual value to something different
    Card.Suit expSuit = Card.Suit.DIAMONDS; // set an expected suit that is different from the actual suit
    Card.Suit suitResult = Card.Suit.CLUBS; // set the actual suit to something different
    assertNotEquals(expValue, result.getValue());
    assertNotEquals(valueResult, result.getValue());
    assertNotEquals(expSuit, result.getSuit());
    assertNotEquals(suitResult, result.getSuit());
}
    @Test
    public void testGenerateRandomCardBoundary() {
    System.out.println("Test generateRandomCard Boundary");
    Card result = Card.generateRandomCard();
    assertTrue(result.getValue().compareTo(Card.Value.ACE) >= 0 && result.getValue().compareTo(Card.Value.KING) <= 0);
    assertTrue(result.getSuit().compareTo(Card.Suit.HEARTS) >= 0 && result.getSuit().compareTo(Card.Suit.CLUBS) <= 0);
}

    
    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringGood() {
    System.out.println("Test toString Good");
    Card instance = new Card(Card.Value.ACE, Card.Suit.SPADES);
    String expResult = "ACE of SPADES";
    String result = instance.toString();
    assertEquals(expResult, result);
}
     @Test
    public void testToStringBad() {
    System.out.println("Test toString Bad");
    Card instance = new Card(Card.Value.TWO, Card.Suit.HEARTS);
    String expResult = "QUEEN of CLUBS"; // set an expected string that is different from the actual string
    String result = "KING of DIAMONDS"; // set the actual string to something different
    assertNotEquals(expResult, instance.toString()); // check that the expected string is not equal to the actual string representation of the card instance
    assertNotEquals(result, instance.toString()); // check that the actual string representation is not equal to the expected string
}

    @Test
    public void testToStringBoundary() {
    System.out.println("Test toString Boundary");
    Card instance = new Card(Card.Value.KING, Card.Suit.HEARTS);
    String expResult = "KING of HEARTS";
    String result = instance.toString();
    assertEquals(expResult, result);
}

}

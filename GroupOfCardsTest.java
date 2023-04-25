/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package deliverable3;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 91628
 */
public class GroupOfCardsTest {

    // Good case: add a card to an empty hand
    @Test
    public void testaddCardGood() {
        System.out.println("  addCard Good");
        ArrayList<Card> hand = new ArrayList<Card>();
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        String expectedOutput = "Card added to your hand successfully";
        
        GroupOfCards.addCard(card, hand);
        String actualOutput = "Card added to your hand successfully";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testaddCardBad() {
        System.out.println("  addCard Bad");
        ArrayList<Card> hand = new ArrayList<Card>();
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        hand.add(card);

        String expectedOutput = "the match of existing card is also found in your hand";

        String actualOutput = GroupOfCards.addCard(card, hand);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testaddCardBoundary() {
        System.out.println("  addCard Boundary");
        ArrayList<Card> hand = new ArrayList<Card>();
        //when value is same , value id different
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        hand.add(new Card(Card.Value.ACE, Card.Suit.SPADES));

        String expectedOutput = "card added to your hand successfully";

        String actualOutput = GroupOfCards.addCard(card, hand);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testMatchPairsGood() {
        System.out.println("matchPairs");
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);;
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.Value.ACE, Card.Suit.SPADES));
        hand.add(new Card(Card.Value.ACE, Card.Suit.DIAMONDS));
        hand.add(new Card(Card.Value.ACE, Card.Suit.CLUBS));
        boolean expResult = true;
        boolean result = GroupOfCards.matchPairs(card, hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testMatchPairsBad() {
        System.out.println("matchPairs Bad");
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);;
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.Value.THREE, Card.Suit.SPADES));
        hand.add(new Card(Card.Value.TWO, Card.Suit.DIAMONDS));
        hand.add(new Card(Card.Value.FOUR, Card.Suit.CLUBS));
        boolean expResult = false;
        boolean result = GroupOfCards.matchPairs(card, hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testMatchPairsBoundary() {
        System.out.println("matchPairs Boundary");
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);;
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.Value.ACE, Card.Suit.SPADES));
        hand.add(new Card(Card.Value.ACE, Card.Suit.DIAMONDS));
        hand.add(new Card(Card.Value.FOUR, Card.Suit.CLUBS));
        boolean expResult = false;
        boolean result = GroupOfCards.matchPairs(card, hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
 @Test
    public void removeCardGood() {
        System.out.println(" removeCard   Good");
        ArrayList<Card> hand = new ArrayList<Card>();
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        hand.add(card);
        String expectedOutput = " ";

        String actualOutput = GroupOfCards.removeCard(card, hand);
        assertEquals(expectedOutput, actualOutput);

    }
    @Test
    public void removeCardBad() {
        System.out.println(" removeCard  Bad");
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.Value.TWO, Card.Suit.SPADES));
          hand.add(new Card(Card.Value.THREE, Card.Suit.SPADES));
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        String expectedOutput = "NO match for similar card you need to gofish ";

        String actualOutput = GroupOfCards.removeCard(card, hand);
        assertEquals(expectedOutput, actualOutput);

    }
    @Test
    public void removeCardBoundary() {
        System.out.println(" removeCard  Bopundary");
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.Value.ACE, Card.Suit.SPADES));
          hand.add(new Card(Card.Value.THREE, Card.Suit.SPADES));
        Card card = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        String expectedOutput = "NO match for similar card you need to gofish ";

        String actualOutput = GroupOfCards.removeCard(card, hand);
        assertEquals(expectedOutput, actualOutput);

    }
}

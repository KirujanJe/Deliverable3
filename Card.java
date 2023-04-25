/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable3;

import java.util.Random;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
public Card(){}
    private Suit suit;
    private Value value;
    //default modifier for child classes

    public enum Suit {
        HEARTS, SPADES, DIAMONDS, CLUBS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING;

      
    };

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
     public static  Card generateRandomCard() {
       // Scanner input = new Scanner(System.in);
        Random ran = new Random();
        Value value = Card.Value.values()[ran.nextInt(13)];
                Suit suit = Card.Suit.values()[ran.nextInt(4)];
                   Card card = new Card(value, suit);
                   return card;
     }

    /**
     *
     * @return
     */
    @Override
   public String toString(){
   return value + " of " + suit ;}
 

  /*  public  ArrayList<Card> generateRandomCard(int sizeOfHand) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        ArrayList<Card> hand = new  ArrayList<Card>();
        for (int i = 0; i < hand.size(); i++) {
            boolean newCardfound = false;
            while (!newCardfound) {
                Value value = Card.Value.values()[ran.nextInt(13)];
                Suit suit = Card.Suit.values()[ran.nextInt(4)];

                Card card = new Card(value, suit);
                for (int j = 0; j < cardRemovedFromDeck.size(); j++) {
                    if (cardRemovedFromDeck.get(i) != null) {
                        if (card.value.compareTo(cardRemovedFromDeck.get(j).getValue()) != 0
                                && card.suit.compareTo(cardRemovedFromDeck.get(j).getSuit()) != 0) {
                            newCardfound = true;
                            hand.add(card);
                            cardRemovedFromDeck.add(card);
                            
                        };
                    }
                }
            }

        } return hand;
    
    }*/
}

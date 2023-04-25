/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

    private String name;
    private int id;
    private int score = 0;
    public ArrayList<Card> hand;
    // constructor for player

    public Player(String name) {
        this.name = name;

    }

    public ArrayList<Player> players = new ArrayList<Player>();

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    /**
     * The method to be overridden when you subclass the Player class with your
     * specific type of Player and filled in with logic to play your game.
     */
    public int getScore() {
        return this.score;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *
     * //@param hand
     */
    public void setHand(ArrayList<Card> hand, ArrayList<Card> cardRemovedFromDeck, ArrayList<Card> deckOfCards) {

        for (int i = 0; i < 7; i++) {
            boolean newCardfound = false;

            if (cardRemovedFromDeck.size() != 0) {
                while (!newCardfound) {
                    Card card = Card.generateRandomCard();
                    for (int j = 0; j < cardRemovedFromDeck.size(); j++) {

                        if (card.getValue().compareTo(cardRemovedFromDeck.get(j).getValue()) == 0
                                && card.getSuit().compareTo(cardRemovedFromDeck.get(j).getSuit()) == 0) {
                            newCardfound = false;}else{ newCardfound =true;}}
                        if(newCardfound){
                            hand.add(card);
                cardRemovedFromDeck.add(card);
                deckOfCards.remove(card);
                        }
                    

                }
             

            }else{ Card card = Card.generateRandomCard();
                hand.add(card);
                cardRemovedFromDeck.add(card);
                deckOfCards.remove(card);}
                

        }
        this.hand = hand;
    }



public void showHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i).getSuit() + " " + hand.get(i).getValue());

        }
    }

    public void leaveGame() {
        // TODO - implement Player.leaveGam
        throw new UnsupportedOperationException();
    }

    /*
    public List<Integer> getScoreHistory() {
        // TODO - implement Player.getScoreHistory
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param name
     */
    /**
     *
     * @param suit
     * @param value
     */
    Scanner input = new Scanner(System.in);

    public ArrayList<Card> requestCard(Player p2) {

        ArrayList<Card> cardsFoundinOppositeHand = new ArrayList<Card>();
        System.out.println("enter the rank"
                + "of Card you want ");
        String value = input.next();

        for (int i = 0; i < p2.hand.size(); i++) {
            if (p2.hand.get(i).getValue().compareTo(Card.Value.valueOf(value)) == 0) {
                cardsFoundinOppositeHand.add(p2.hand.get(i));
            }

        }

        return cardsFoundinOppositeHand;
    }

    public void getCard(Card card) {
        hand.add(card);
    }

//value
    /**
     *
     * @param playerId
     * @param suit
     * @param value
     */
}

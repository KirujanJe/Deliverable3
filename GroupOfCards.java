/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. 
 * HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
 ArrayList<Card> deckOfCards;

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

   
    /**
     * 
     * @param card
     */
    public static void  addCard(Card card, ArrayList<Card> hand) {
        hand.add(card);
    }

    /**
     * 
     * @param index
     */
    public static void removeCard(Card card, ArrayList<Card> hand ) {
        boolean cardRemoved =false;
      for(int i =0 ; i< hand.size();i++){
          if( card.getValue().compareTo(hand.get(i).getValue())==0&&
                  card.getSuit().compareTo(hand.get(i).getSuit())==0){
                 hand.remove(i);
                 cardRemoved= true;
        }
   }          if(cardRemoved==false){
   System.out.println("NO match for similar card hence you need to go fish");}

    }
    public  static boolean matchPairs(Card card,ArrayList<Card> hand){
       int sameRankCards=0;
       for(int k =0 ;k<hand.size();k++){
       if(card.getValue().compareTo(hand.get(k).getValue())==0){
       sameRankCards++; }}
 
    if(sameRankCards ==4){System.out.print("you got 1 score as one pair matches");
     
    return true;
} else{ System.out.println(" matching pairs of four do not exist in your hand");
return false;
   }}

    /**
     * 
     * @param index
     
    public Card getCard(int index) {
        // TODO - implement GroupOfCards.getCard
        throw new UnsupportedOperationException();
    }

    public int getNumOfCards() {
        // TODO - implement GroupOfCards.getNumOfCards
        throw new UnsupportedOperationException();
    }

    public void clear() {
        // TODO - implement GroupOfCards.clear
        throw new UnsupportedOperationException();
    }
      public GroupOfCards() {
        // TODO - implement GroupOfCards.GroupOfCards
        throw new UnsupportedOperationException();
    }*/

  

}//end class

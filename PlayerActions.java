package deliverable3;

import java.util.Scanner;

public class PlayerActions extends Player{
   PlayerActions(String name){
   super(name);}
   
    private Game game;
    private int playerId;
    private int opponentId;
   Scanner input = new Scanner(System.in);

    /**
     * 
     * @param id
     * @param suit
     * @param value
     */
    
    /**
     * 
     * @param id
     * @param suit
     * @param value
     */
    public void giveCard(int id, String suit, int value) {
        
    }

    /**
     * 
     * @param id
     */
    public Card getCard() {
        // TODO - implement PlayerActions.goFish
        throw new UnsupportedOperationException();
    }

    public int getPlayerId() {
        return this.playerId;
    }

    /**
     * 
     * @param playerId
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getOpponentId() {
        return this.opponentId;
    }

    /**
     * 
     * @param opponentId
     */
    public void setOpponentId(int opponentId) {
        this.opponentId = opponentId;
    }

    /**
     * 
     * @param input
     */
    private boolean isValidInput(String input) {
        // TODO - implement PlayerActions.isValidInput
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param input
     */
    private int[] parseInput(String input) {
        // TODO - implement PlayerActions.parseInput
        throw new UnsupportedOperationException();
    }

}
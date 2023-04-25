/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 91628
 */
public class PlayGoFish {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = 2;

        System.out.println("Enter name of first player for registeration");
        String player1name = input.nextLine();
        PlayerRegistration r1ForG1 = new PlayerRegistration();
        r1ForG1.RegisterPlayer(player1name, players);

        System.out.println("Enter name of second player for registeration");
        String player2name = input.nextLine();
        r1ForG1.RegisterPlayer(player2name, players);

        System.out.println("To start the game press S");
        String nextInput = input.next();
        if (nextInput.equals("S")) {
            Game G1 = new Game();
            ArrayList<Card> deckOfCardsinMiddle = new ArrayList<Card>();
            G1.startGame(players, deckOfCardsinMiddle);

            ArrayList<Card> cardRemovedFromDeck = new ArrayList<Card>();
            Player p1 = players.get(0);
            Player p2 = players.get(1);
  boolean turnPlayer1 = true;
            while (p1.hand.size() != 0 && p2.hand.size() != 0 && deckOfCardsinMiddle.size() != 0) {
               
                if (turnPlayer1) {
                    turnPlayer1 = false;

                    System.out.println(" Your hand is shown below: ");
                    p1.showHand();

                    ArrayList<Card> cardsToTransfer = p1.requestCard(p2);
                    if (cardsToTransfer.size() != 0) {
                        for (int i = 0; i < cardsToTransfer.size(); i++) {
                            GroupOfCards.addCard(cardsToTransfer.get(i), p1.getHand());
                            if (GroupOfCards.matchPairs(cardsToTransfer.get(i), p2.getHand())) {
                                p1.setScore(p1.getScore() + 1);
                                for (int j = 0; j < 4; j++) {
                                    GroupOfCards.removeCard(cardsToTransfer.get(i), p1.getHand());
                                }
                            }
                            GroupOfCards.removeCard(cardsToTransfer.get(i), p2.getHand());

                        }
                    } else {
                        System.out.println("You need to go fish");
                        Card cardafterGoFish = deckOfCardsinMiddle.get(deckOfCardsinMiddle.size() - 1);
                        GroupOfCards.addCard(cardafterGoFish, p2.getHand());
                        if (GroupOfCards.matchPairs(cardafterGoFish, p1.getHand())) {
                            p1.setScore(p1.getScore() + 1);
                            for (int j = 0; j < 4; j++) {
                                GroupOfCards.removeCard(cardafterGoFish, p1.getHand());
                            }
                        }

                        GroupOfCards.removeCard(cardafterGoFish, deckOfCardsinMiddle);

                    }

                    System.out.println("if  you want to exit type X OR Type anything to continue");
                    String userinput = input.next();
                    if (userinput.equals("X")) {

                        G1.exitGame(players);
                        break;
                    } else {
                        System.out.println("Game continued ");
                    }
                } else {

                    System.out.println(" second player turn \n hand of second player is shown below: ");
                    p2.showHand();

                    ArrayList<Card> cardsToTransfer = p2.requestCard(p1);
                    if (cardsToTransfer.size() != 0) {
                        for (int i = 0; i < cardsToTransfer.size(); i++) {
                            GroupOfCards.addCard(cardsToTransfer.get(i), p2.getHand());
                            if (GroupOfCards.matchPairs(cardsToTransfer.get(i), p1.getHand())) {
                                p2.setScore(p2.getScore() + 1);
                                for (int j = 0; j < 4; j++) {
                                    GroupOfCards.removeCard(cardsToTransfer.get(i), p2.getHand());
                                }
                            }

                            GroupOfCards.removeCard(cardsToTransfer.get(i), p1.getHand());

                        }
                    } else {
                        System.out.println("You need to go fish");
                        Card cardafterGoFish = deckOfCardsinMiddle.get(deckOfCardsinMiddle.size() - 1);
                        GroupOfCards.addCard(cardafterGoFish, p2.getHand());
                        if (GroupOfCards.matchPairs(cardafterGoFish, p1.getHand())) {
                            p2.setScore(p2.getScore() + 1);
                            for (int j = 0; j < 4; j++) {
                                GroupOfCards.removeCard(cardafterGoFish, p2.getHand());
                            }
                        }

                        GroupOfCards.removeCard(cardafterGoFish, deckOfCardsinMiddle);

                    }

                    System.out.println("if  you want to exit type X  Or type any thing else to continue");
                    String userinput = input.next();
                    if (userinput.equals("X")) {

                        G1.exitGame(players);
                        break;
                    } else {
                        System.out.println("Game continued ");
                    }
                    turnPlayer1 = true;
                }

            }
        }
    }
}

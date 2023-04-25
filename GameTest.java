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

public class GameTest {
      @Test
public void testStartGameWithValidPlayers() {
    System.out.println("StartGame good");
    ArrayList<Player> players = new ArrayList<>();
    players.add(new Player("Player 1"));
    players.add(new Player("Player 2"));
    ArrayList<Card> deckOfCards = new ArrayList<>();
    Game game = new Game();
    String result = game.startGame(players, deckOfCards);
    assertEquals("game started succesfully", result);
  
}

    @Test
  public   void testStartGameboundary() {
        System.out.println("StartGame boundary");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("john"));
        players.add(new Player("Bob"));

        ArrayList<Card> deckOfCards = new ArrayList<>();
        Game game = new Game();

        // Check that each player has the expected hand size
        String result = game.startGame(players, deckOfCards);
        String expResult = "game started succesfully";
        assertEquals(expResult, result);
    }

    @Test
   public  void testStartGamebad() {
        System.out.println("StartGame bad");
        ArrayList<Player> players = new ArrayList<>();

        ArrayList<Card> deckOfCards = new ArrayList<>();
        Game game = new Game();

        // Check that each player has the expected hand size
        String result = game.startGame(players, deckOfCards);
        String expResult = "player size must be between 2 and 4";
        assertEquals(expResult, result);
    }
/*
   
     * Test of startGame method, of class Game.
     *
     * @Test public void testStartGame() { System.out.println("startGame");
     * ArrayList<Player> players = null; ArrayList<Card> deckOfCards = null;
     * Game instance = new Game(); instance.startGame(players, deckOfCards); //
     * TODO review the generated test code and remove the default call to fail.
     *
     * }
     */
    /**
     * Test of requestCard method, of class Game.
     *
     *
     * /**
     * Test of exitGame method, of class Game.
     */
    @Test
    public void testExitGameGood() {
        System.out.println("exitGame good");

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("h1"));
        players.add(new Player("b1"));
        players.add(new Player("c1"));
        players.get(0).setScore(10);
        players.get(1).setScore(20);
        players.get(2).setScore(30);
        Game game = new Game();
        String result = game.exitGame(players);
        String expResult = "Winner is player 3";
        assertEquals(expResult, result);
    }

    @Test
    public void testExitGameBoundary() {
        System.out.println("exitGame boundary");

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("h1"));

        players.get(0).setScore(10);

        Game game = new Game();
        String result = game.exitGame(players);
        String expResult = "Winner is player 1";
        assertEquals(expResult, result);
    }

    @Test
    public void testExitGameBad() {
        System.out.println("exitGame bad");

        ArrayList<Player> players = new ArrayList<>();

        Game game = new Game();
        String result = game.exitGame(players);
        String expResult = "Game do not have any players i.e. players is empty";
        assertEquals(expResult, result);
    }

}

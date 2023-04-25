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
public class PlayerActionsTest {

    /**
     * Test of setPlayerId method, of class PlayerActions.
     */
        @Test
        public void testSetPlayerId() {
        Player player = new Player();
        int expectedId = 1;
        
        player.setPlayerId(expectedId);
        
        int actualId = player.getPlayerId();
        assertEquals(expectedId, actualId);
    }

    /**
     * Test of setOpponentId method, of class PlayerActions.
     */
        @Test
        public void testSetOpponentId() {
        Player player = new Player();
        int expectedId = 2;
        
        player.setOpponentId(expectedId);
        
        int actualId = player.getOpponentId();
        assertEquals(expectedId, actualId);
    }
    }
    

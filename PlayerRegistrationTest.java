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
 * @author carte
 */
public class PlayerRegistrationTest {

    /**
     * Test of RegisterPlayer method, of class PlayerRegistration.
     */
    @Test
    public void testRegisterPlayer() {
        ArrayList<Player> players = new ArrayList<Player>();
        String playerName = "John";
        RegisterPlayer(playerName, players);
        assertEquals(1, players.size());
        assertEquals(playerName, players.get(0).getName());
    }

   

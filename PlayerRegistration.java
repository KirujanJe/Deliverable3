package deliverable3;

import java.util.ArrayList;

public class PlayerRegistration {

    private String name;
    private int id;
    private int score = 0;
 

    public void RegisterPlayer(String name, ArrayList<Player> players) {
        String playerName = name;
        Player p1 = new Player(name);
        id = generatePlayerId(players);
        players.add(p1);
        System.out.println("Registered Successfully ,  player Id :" +  id);
    }

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

    public int getPlayerCount(  ArrayList<Player> players) {
        return players.size();
    }
    /*
    public ArrayList<Player> getPlayers() {
        return this.players;
    }*/

    public int generatePlayerId( ArrayList<Player> players) {
        return players.size() + 1;
    }

}

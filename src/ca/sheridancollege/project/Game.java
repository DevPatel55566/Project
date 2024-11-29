package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dev and shweta
 * @author dev and Shweta 28-11-2024
 */
public abstract class Game {
    private String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public abstract void play();

    public abstract void declareWinner();
}
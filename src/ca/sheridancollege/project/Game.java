package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dev and shweta
 * @author dev and Shweta 10-10-2024
 */
public abstract class Game {

	private final String name;
	/**
	 * the title of the game
	 */
	private Collection<Player> players;

	public String getName() {
		return this.name;
	}

	public Collection<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	/**
	 * the players of the game
	 * @param name
	 */
	public Game(String name) {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public abstract void play();

	/**
	 * When the game is over, use this method to declare and display a winning player.
	 */
	public abstract void declareWinner();

}
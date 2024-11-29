package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * 
 * @author dev and shweta
 * @author dev and Shweta 28-11-2024
 */

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public int calculateScore() {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            String rank = card.getRank();
            if (rank.equals("Ace")) {
                score += 11;
                aceCount++;
            } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                score += 10;
            } else {
                score += Integer.parseInt(rank);
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }

    public void play() {
        // The logic will be added in blackjack class and method would be overriden
    }

    public void showHand() {
        System.out.println(name + "'s hand: " + hand);
    }
}
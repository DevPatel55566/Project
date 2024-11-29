package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. 
 * 
 * @author dev and shweta
 * @author dev and Shweta 28-11-2024
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

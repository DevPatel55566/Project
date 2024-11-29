package ca.sheridancollege.project;

import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dev and shweta
 * @author dev and Shweta 28-11-2024
 */
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    private int size;
    private ArrayList<Card> cards;

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}

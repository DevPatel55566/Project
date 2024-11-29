package ca.sheridancollege.project;

/**
 * A class to be used as the main class for the project. 
 * 
 * @author dev and shweta 28-11-2024
 * @author dev and Shweta 28-11-2024
 */
import java.util.Scanner;

public class BlackJack extends Game {
    private GroupOfCards deck;
    private Player dealer;

    public BlackJack(String name) {
        super(name);
        deck = new GroupOfCards(52);
        dealer = new Player("Dealer");
        deck.shuffle();
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Player player = getPlayers().get(0);

        dealInitialCards(player, dealer);

        while (player.calculateScore() < 21) {
            player.showHand();
            System.out.println("Your score: " + player.calculateScore());
            System.out.print("Hit or Stand? (h/s): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("h")) {
                player.addCardToHand(deck.getCards().remove(0));
                
            } else {
                break;
            }
        }

        while (dealer.calculateScore() < 17) {
            dealer.addCardToHand(deck.getCards().remove(0));
        }

        player.showHand();
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer's score: " + dealer.calculateScore());

        declareWinner();
    }

    private void dealInitialCards(Player player, Player dealer) {
        player.addCardToHand(deck.getCards().remove(0));
        player.addCardToHand(deck.getCards().remove(0));
        dealer.addCardToHand(deck.getCards().remove(0));
        dealer.addCardToHand(deck.getCards().remove(0));
    }

    @Override
    public void declareWinner() {
        Player player = getPlayers().get(0);
        int playerScore = player.calculateScore();
        int dealerScore = dealer.calculateScore();

        if (playerScore > 21) { //playerScore > 21 then dealer wins
            System.out.println("Dealer wins.");
        } else if (dealerScore > 21 || playerScore > dealerScore) { //playerScore < 21 then player wins
            System.out.println("You win!");
        } else if (playerScore < dealerScore) { //playerScore < dealerScore then dealer wins
            System.out.println("Dealer wins.");
        } else { //Else it's a tire 
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        BlackJack game = new BlackJack("Blackjack");
        Player player = new Player(playerName);
        game.getPlayers().add(player);

        game.play();
    }
}
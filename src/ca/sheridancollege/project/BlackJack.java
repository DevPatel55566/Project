package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the player's name
        System.out.print("Enter player's name: ");
        String playerName = scanner.nextLine();

        // Display the entered name
        System.out.println("Player's name is: " + playerName);
    }
}

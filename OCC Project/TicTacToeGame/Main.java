package TicTacToeGame;

import java.util.Scanner;

import TicTacToeGame.Authentication.Login;
import TicTacToeGame.Authentication.Register;
import TicTacToeGame.Authentication.User;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1Name;
        String player1Password;

        // Register or login Player 1
        System.out.println("1. Register as Player 1");
        System.out.println("2. Login as Player 1");
        int player1Choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        Player player1;

        switch (player1Choice) {
            case 1:
                // Register as Player 1
                do {
                    System.out.println("Input Player 1 name: ");
                    player1Name = scanner.nextLine();
                } while (Login.verifyUserName(player1Name));

                System.out.println("Input password: ");
                player1Password = scanner.nextLine();

                Register.registerUser(player1Name, player1Password);
                player1 = new RegisteredPlayer('X', player1Name, player1Name, player1Password);
                break;

            case 2:

        
                // Login as Player 1
                System.out.println("Input Player 1 name: ");
                player1Name = scanner.nextLine();
                System.out.println("Input password: ");
                player1Password = scanner.nextLine();
                User tmpUser1 = new User(player1Name, player1Password);

                if (Login.loginUser(tmpUser1)) {
                    player1 = new RegisteredPlayer('X', player1Name, player1Name, player1Password);
                } else {
                    System.out.println("Login failed. Exiting.");
                    return;
                }
                break;

            default:
                System.out.println("Quitting.");
                scanner.close();
                return;
        }

        // Register or login Player 2
        System.out.println("3. Register as Player 2");
        System.out.println("4. Login as Player 2");
        int player2Choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        Player player2;
        String player2Name; // Move declaration outside the do-while loop

        switch (player2Choice) {
            case 3:
                // Register as Player 2
                do {
                    System.out.println("Input Player 2 name: ");
                    player2Name = scanner.nextLine();
                } while (Login.verifyUserName(player2Name));

                System.out.println("Input Player 2 password: ");
                String player2Password = scanner.nextLine();

                Register.registerUser(player2Name, player2Password);
                player2 = new RegisteredPlayer('O', player2Name, player2Name, player2Password);
                break;

            case 4:
                // Login as Player 2
                System.out.println("Input Player 2 name: ");
                String existingPlayer2Name = scanner.nextLine();
                System.out.println("Input Player 2 password: ");
                String existingPlayer2Password = scanner.nextLine();
                User tmpUser2 = new User(existingPlayer2Name, existingPlayer2Password);

                if (Login.loginUser(tmpUser2)) {
                    player2 = new RegisteredPlayer('O', existingPlayer2Name, existingPlayer2Name, existingPlayer2Password);
                } else {
                    System.out.println("Login failed. Exiting.");
                    return;
                }
                break;

            default:
                System.out.println("Quitting.");
                scanner.close();
                return;
        }

        Game game = new Game(player1, player2);
        game.playGame();

        // Save player history after the game
        player1.savePlayerHistory("Game Over");
        player2.savePlayerHistory("Game Over");

        scanner.close();
    }
}


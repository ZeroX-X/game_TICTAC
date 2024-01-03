// GuestPlayer.java
package TicTacToeGame;

import java.util.List;

public class GuestPlayer extends Player {

    public GuestPlayer(char symbol, String playerName) {
        super(symbol, playerName);
    }

    @Override
    public int makeMove(List<Integer> positions) {
        // Implement the logic for making a move for the guest player
        // For example, you might want to generate a random move
        // or ask for input from the user
        return 0; // Placeholder, replace with your logic
    }
}

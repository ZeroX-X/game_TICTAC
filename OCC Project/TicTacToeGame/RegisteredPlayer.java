package TicTacToeGame;

import java.util.List;

public class RegisteredPlayer extends Player {
    public RegisteredPlayer(char symbol, String playerName, String username, String password) {
        super(symbol, playerName);
    }

    @Override
    public int makeMove(List<Integer> positions) {
        return super.makeMove(positions);
    }

    @Override
    public void savePlayerHistory(String result) {
        super.savePlayerHistory(result);
    }
}

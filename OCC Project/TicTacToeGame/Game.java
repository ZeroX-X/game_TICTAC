package TicTacToeGame;
import java.util.Arrays;
import java.util.List;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        board.printGameBoard();

        while (true) {
            getPlayerMove(player1);
            board.printGameBoard();
            String result = checkWinner(player1);
            if (!result.isEmpty()) {
                displayResult(result, player1, player2);
                break;
            }

            getPlayerMove(player2);
            board.printGameBoard();
            result = checkWinner(player2);
            if (!result.isEmpty()) {
                displayResult(result, player2, player1);
                break;
            }
        }
    }

    private void displayResult(String result, Player winner, Player loser) {
        System.out.println(result);

        if (result.contains("wins")) {
            System.out.println("Congratulations, " + winner.getPlayerName() + "!");
            System.out.println("Sorry, " + loser.getPlayerName() + ", you lost.");
            winner.incrementWins();
            loser.incrementLosses();
        } else if (result.equals("Draw")) {
            System.out.println("It's a draw!");
        }

        winner.savePlayerHistory(result);
        loser.savePlayerHistory(result);
    }

    private void getPlayerMove(Player player) {
        List<Integer> playerPositions = (player == player1) ? board.getPlayer1Positions() : board.getPlayer2Positions();
        int move = player.makeMove(playerPositions);
        char symbol = player.getSymbol();
        board.placePiece(move, symbol);
    }

    private String checkWinner(Player player) {
        List<List<Integer>> winningConditions = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9),
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9),
                Arrays.asList(1, 5, 9),
                Arrays.asList(3, 5, 7)
        );

        if (board.isBoardFull()) {
            return "Draw";
        }
        for (List<Integer> condition : winningConditions) {
            List<Integer> playerPositions = (player == player1) ? board.getPlayer1Positions() : board.getPlayer2Positions();
            if (playerPositions.containsAll(condition)) {
                return player.getPlayerName() + " wins!";
            }
        }

        return "";
    }
}

    
    

package TicTacToeGame;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

// Add this functional interface at the end of the Player.java file
interface MoveValidator {
    boolean validateMove(int move, List<Integer> positions);
}
public abstract class Player {
    protected char symbol;
    protected String playerName;
    protected int wins;
    protected int losses;

    public Player(char symbol, String playerName) {
        this.symbol = symbol;
        this.playerName = playerName;
        this.wins = 0;
        this.losses = 0;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    // Modify the makeMove method to use the functional interface
    public int makeMove(List<Integer> positions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getPlayerName() + ", enter your placement (1-9): ");

        // Using a lambda expression for move validation
        MoveValidator moveValidator = (move, existingPositions) ->
                !existingPositions.contains(move) && move >= 1 && move <= 9;

        int move;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number (1-9): ");
                scanner.next(); // consume invalid input
            }
            move = scanner.nextInt();

            if (!moveValidator.validateMove(move, positions)) {
                System.out.println("Invalid move! Enter a correct position (1-9): ");
            }

        } while (!moveValidator.validateMove(move, positions));

        return move;
    }
    @Override
    public String toString() {
        return playerName + " (" + symbol + ")";
    }



public void savePlayerHistory(String result) {
    savePlayerHistory(result, "userRecord.txt");
}

public void savePlayerHistory(String result, String filename) {
    LocalDateTime timestamp = LocalDateTime.now();

    try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Write record with a single timestamp for both player records
        writer.println("Timestamp: " + timestamp.format(formatter) + ",");
        writer.println("Result: " + result + ",");
        writer.println("Username: " + playerName + ",");
        writer.println("Symbol: " + symbol + ",");
        writer.println("Win: " + wins + ",");
        writer.println("Lose: " + losses);
        writer.println("___________");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }
}


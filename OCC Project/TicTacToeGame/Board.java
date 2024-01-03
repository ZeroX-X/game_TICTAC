package TicTacToeGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private char[][] gameBoard;
    private static List<Integer> player1Positions;
    private static List<Integer> player2Positions;

    public Board() {
        gameBoard = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        player1Positions = new ArrayList<>();
        player2Positions = new ArrayList<>();
    }

    public void printGameBoard() {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public void placePiece(int pos, char symbol) {
        if (player1Positions.contains(pos) || player2Positions.contains(pos)) {
            System.out.println("Position taken! Enter a correct position");
            return;
        }

        if (symbol == 'X') {
            player1Positions.add(pos);
        } else if (symbol == 'O') {
            player2Positions.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    

        


    public boolean isBoardFull() {
        return player1Positions.size() + player2Positions.size() == 9;
    }

    // Getter methods for player positions, returning unmodifiable lists
    public List<Integer> getPlayer1Positions() {
        return Collections.unmodifiableList(player1Positions);
    }

    public List<Integer> getPlayer2Positions() {
        return Collections.unmodifiableList(player2Positions);
    }
}


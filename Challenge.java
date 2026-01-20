import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (random.nextBoolean()) {
                    board[i][j] = 'X';
                } else {
                    board[i][j] = 'O';
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
      
        char winner = checkWinner(board);
        if (winner == 'X') {
            System.out.println("X wins!");
        } else if (winner == 'O') {
            System.out.println("O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    
    public static char checkWinner(char[][] board) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0];
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i];
        }
        
        
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
        
        return ' ';
    }

}

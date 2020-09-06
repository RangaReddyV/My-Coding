package LetCo.mck;

public class TicTocToe {

    public String tictactoe(int[][] moves) {
        char board[][] = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = ((i & 1) == 0) ? 'A' : 'B';
        }
        if (validateBoard(board, 'A', 3))
            return "A";
        else if (validateBoard(board, 'B', 3))
            return "B";
        else if (moves.length == 9)
            return "Draw";
        else
            return "Pending";

    }

    private boolean validateBoard(char[][] board, char player, int len) {
        boolean row;
        boolean col;
        for (int i = 0; i < len; i++) {
            row = true;
            col = true;
            for (int j = 0; j < len; ++j) {
                if (board[i][j] != player)
                    row = false;

                if (board[j][i] != player)
                    col = false;
            }

            if (row || col)
                return true;
        }

        row = true;
        col = true;
        for (int j = 0; j < len; ++j) {
            if (board[j][j] != player)
                row = false;

            if (board[j][len - 1 - j] != player)
                col = false;

        }
        if (row || col)
            return true;

        return false;
    }

    public static void main(String[] args) {

    }
}

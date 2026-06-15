package com.problems.matrix;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (row[board[i][j] - '1']) return false;
                    row[board[i][j] - '1'] = true;
                }
                if (board[j][i] != '.') {
                    if (col[board[j][i] - '1']) return false;
                    col[board[j][i] - '1'] = true;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!valid(board, i, j)) return false;
            }
        }

        return true;
    }

    private boolean valid(char[][] board, int row, int col) {
        boolean[] visited = new boolean[9];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    if (visited[board[i][j] - '1']) return false;
                    visited[board[i][j] - '1'] = true;
                }
            }
        }
        return true;
    }
}

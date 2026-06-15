package com.problems.matrix;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (row[i]) {
                for (int j = 0; j < m; j++) matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            if (col[i]) {
                for (int j = 0; j < n; j++) matrix[j][i] = 0;
            }
        }
    }
}

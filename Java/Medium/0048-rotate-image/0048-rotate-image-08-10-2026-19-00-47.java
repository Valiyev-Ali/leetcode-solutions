class Solution {
    public void rotate(int[][] matrix) {
        int tempVal;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (r >= c ) {
                    continue;
                }
                tempVal = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = tempVal;
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length / 2; c++) {
                tempVal = matrix[r][c];
                matrix[r][c] = matrix[r][matrix.length - c - 1];
                matrix[r][matrix.length - c - 1] = tempVal;
            }
        }
    }
}
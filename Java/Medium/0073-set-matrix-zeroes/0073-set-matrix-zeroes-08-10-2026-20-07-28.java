class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    rows.add(r);
                    cols.add(c);
                }
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][cols.get(i)] = 0;
            }
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[rows.get(i)][c] = 0;
            }
        }
    }
}
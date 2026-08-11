class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((r * c) != (mat.length * mat[0].length)) {
            return mat;
        }
        int[][] newMat = new int[r][c];
        Queue <Integer> numOrder = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                numOrder.offer(mat[i][j]);
            }
        } 
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                newMat[i][j] = numOrder.poll();
            }
        }

        return newMat;
    }
}
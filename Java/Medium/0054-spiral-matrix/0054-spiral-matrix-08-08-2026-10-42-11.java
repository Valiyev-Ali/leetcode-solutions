class Solution {
    public boolean[][] visited;
    public List<Integer> result = new ArrayList<>();
    public int currRow = 0;
    public int currCol = 0;

    public List<Integer> spiralOrder(int[][] matrix) {
        visited = new boolean[matrix.length][matrix[0].length];
        result.add(matrix[0][0]);
        visited[0][0] = true;
        return executeSpiral(matrix);
    }

    public List<Integer> executeSpiral(int[][] matrix) {
        if (moveRight(matrix)) {
            return executeSpiral(matrix);
        }
        else if (moveDown(matrix)) {
            return executeSpiral(matrix);
        }
        else if (moveLeft(matrix)) {
            return executeSpiral(matrix);
        }
        else if (moveUp(matrix)) {
            return executeSpiral(matrix);
        }
        else {
            return result;
        }
    }

    public boolean moveRight(int[][] matrix) {
        if ((currCol < matrix[0].length - 1) && (!visited[currRow][currCol + 1])) {
            result.add(matrix[currRow][++currCol]);
            visited[currRow][currCol] = true;
            moveRight(matrix);
            return true;
        }
        return false;
    }

    public boolean moveDown(int[][] matrix) {
        if ((currRow > 0) && (!visited[currRow - 1][currCol])) {
            result.add(matrix[--currRow][currCol]);
            visited[currRow][currCol] = true;
            moveDown(matrix);
            return true;
        }
        return false;
    }

    public boolean moveLeft(int[][] matrix) {
        if ((currCol > 0) && (!visited[currRow][currCol - 1])) {
            result.add(matrix[currRow][--currCol]);
            visited[currRow][currCol] = true;
            moveLeft(matrix);
            return true;
        }
        return false;
    }

    public boolean moveUp(int[][] matrix) {
        if ((currRow < matrix.length - 1) && (!visited[currRow + 1][currCol])) {
            result.add(matrix[++currRow][currCol]);
            visited[currRow][currCol] = true;
            moveUp(matrix);
            return true;
        }
        return false;
    }
    
}
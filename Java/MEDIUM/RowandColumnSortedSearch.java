package Java.MEDIUM;

public class RowandColumnSortedSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length, i = 0, j = matrix[0].length - 1;
        while (i >= 0 && i < row && j >= 0 && j < col) {

            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

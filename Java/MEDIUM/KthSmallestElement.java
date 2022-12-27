package Java.MEDIUM;

public class KthSmallestElement {
    public static int kthSmallest(int[][] matrix, int k) {
        int min = matrix[0][0], r = matrix.length, c = matrix[0].length, max = matrix[r - 1][c - 1];
        while (min != max) {
            int mid = min + (max - min) / 2;
            int count = lessOrEqual(matrix, mid, r, c);
            if (count < k)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }

    private static int lessOrEqual(int[][] matrix, int mid, int r, int c) {
        int count = 0, i = 0, j = c - 1;
        while (i >= 0 && i < r && j >= 0 && j < c) {
            if (matrix[i][j] <= mid) {
                count += j + 1;
                i++;
            } else
                j--;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

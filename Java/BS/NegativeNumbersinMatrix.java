package Java.BS;

public class NegativeNumbersinMatrix {

    public static int countNegatives(int[][] grid) {
        int r = grid.length, c = grid[0].length, i = r - 1, j = 0, count = 0;
        while (i >= 0 && j < c) {
            if (grid[i][j] >= 0)
                j++;
            else if (grid[i][j] < 0) {
                count += c - j;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

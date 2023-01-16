package Java.ALGO;

public class MaxAreaIsland {

    public int maxAreaIsland(int[][] grid) {
        int r = grid.length, c = grid[0].length, max = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (grid[i][j] == 1)
                    max = Math.max(max, dfs(grid, i, j));
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1)
            return 0;
        else {
            grid[i][j] = -1;
            return 1 + (dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j + 1) + dfs(grid, i, j - 1));
        }
    }
}

package Java.ALGO;

import java.util.Arrays;

public class Matrix01 {
    static int[][] visited;

    public static int[][] updateMatrix(int[][] mat) {
        int r = mat.length, c = mat[0].length, visited[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = dfs(mat, i, j, r, c, visited);
            }
        }
        return mat;
    }

    private static int dfs(int[][] mat, int i, int j, int r, int c, int[][] visited) {
        if (i < 0 || i >= r || j < 0 || j >= c)
            return Integer.MAX_VALUE;
        else if (mat[i][j] == 0) {
            visited[i][j] = 1;
            return 0;
        } else if (visited[i][j] == 1)
            return mat[i][j];
        else {
            visited[i][j] = 1;
            int x = Math.min(dfs(mat, i + 1, j, r, c, visited), dfs(mat, i - 1, j, r, c, visited));
            int y = Math.min(dfs(mat, i, j - 1, r, c, visited), dfs(mat, i, j + 1, r, c, visited));
            return mat[i][j] = 1 + Math.min(x, y);
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] x = updateMatrix(mat);
        for (int i[] : x)
            System.out.println(Arrays.toString(i));
    }

}

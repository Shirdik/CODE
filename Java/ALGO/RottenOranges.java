package Java.ALGO;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0, r = grid.length, c = grid[0].length, x = 0, y = 0, t = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int item = grid[i][j];
                if (item == 1)
                    freshOranges++;
                else if (item == 2) {
                    q.add(new int[] { i, j });
                }
            }
        }
        int[][] coords = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        if (freshOranges == 0)
            return 0;
        while (!q.isEmpty()) {
            t++;
            int size = q.size();
            for (int n = 0; n < size; n++) {
                int[] pos = q.remove();
                for (int[] coord : coords) {
                    int i = pos[0] + coord[0], j = pos[1] + coord[1];
                    if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] != 1)
                        continue;
                    grid[i][j] = 2;
                    freshOranges--;
                    q.add(new int[] { i, j });
                }
            }
        }

        return freshOranges == 0 ? t - 1 : -1;

    }

}

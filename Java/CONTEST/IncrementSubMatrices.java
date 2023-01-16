package Java.CONTEST;

public class IncrementSubMatrices {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] m = new int[n][n];
        for (int x[] : queries) {
            int r1 = Math.min(x[0], x[2]), r2 = Math.max(x[0], x[2]);
            int c1 = Math.min(x[1], x[3]), c2 = Math.max(x[1], x[3]);

            for (int i = r1; i <= r2; i++)
                for (int j = c1; j <= c2; j++)
                    m[i][j]++;
        }
        return m;
    }
}

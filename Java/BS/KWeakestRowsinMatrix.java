package Java.BS;

import java.util.TreeSet;

public class KWeakestRowsinMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length, r[] = new int[k], a[][] = new int[rows][2];
        TreeSet<int[]> s = new TreeSet<>((x, y) -> x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]);
        for (int i = 0; i < rows; i++) {
            a[i][0] = soldiers(mat, i);
            a[i][1] = i;
            s.add(a[i]);
        }
        for (int i = 0; i < k; i++)
            r[i] = s.pollFirst()[1];
        return r;
    }

    private int soldiers(int[][] mat, int i) {
        int l = 0, len = mat[i].length, h = len;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (mat[i][mid] == 1)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }

}

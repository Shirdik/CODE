package Java.DAILY;

import java.util.HashMap;

public class MaxPointsOnLine {

    public static int maxPoints(int[][] points) {
        int len = points.length;
        if (len == 1)
            return len;
        else {
            int max = 0;
            for (int i = 0; i < len; i++) {
                HashMap<Double, Integer> m = new HashMap<>();
                for (int j = i + 1; j < len; j++) {
                    double slope = calScope(points[i], points[j]);
                    m.put(slope, m.getOrDefault(slope, 0) + 1);
                    max = Math.max(max, m.get(slope));
                }
            }
            return max + 1;
        }
    }

    private static double calScope(int[] a, int[] b) {
        int x1 = a[0], y1 = a[1], x2 = b[0], y2 = b[1];
        if (x1 == x2)
            return Double.MAX_VALUE;
        if (y1 == y2)
            return 0;
        return (double) (y2 - y1) / (double) (x2 - x1);
    }
}

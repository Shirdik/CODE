package Java.DAILY;

import java.util.Arrays;

public class MinArrowsToBurstBaloons {
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 1)
            return 1;
        Arrays.sort(points, (a, b) -> Long.valueOf(a[1]) - Long.valueOf(b[1]) < 0 ? -1 : 1);
        int count = 1, pos = points[0][1], len = points.length;
        for (int i = 1; i < len; i++) {
            int s = points[i][0], e = points[i][1];
            if (s > pos) {
                count++;
                pos = e;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        System.out.println(findMinArrowShots(points));

    }
}

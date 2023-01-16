package Java.OTHER;

import java.util.Arrays;

public class TrapRainWater {

    public static int trap(int[] height) {
        int len = height.length, o = 0, max[][] = new int[len][2], t = 0;
        for (int i = 0; i < len; i++) {
            max[i][0] = t;
            t = Math.max(t, height[i]);
        }
        t = 0;
        for (int i = len - 1; i > 0; i--) {
            max[i][1] = t;
            t = Math.max(t, height[i]);
        }
        for (int[] x : max)
            System.out.println(x[0] + " " + x[1]);
        for (int i = 0; i < len; i++) {
            int l = max[i][0], r = max[i][1], h = height[i];
            if (h < l && h < r)
                o += Math.min(l, r) - h;
        }
        return o;
    }

    public static int trap1(int[] height) {
        int len = height.length, l = 0, r = len - 1, lm = 0, rm = 0, o = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] > lm)
                    lm = height[l];
                else
                    o += lm - height[l];
                l++;
            } else {
                if (height[r] > rm)
                    rm = height[r];
                else
                    o += rm - height[r];
                r--;

            }
        }
        return o;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

}

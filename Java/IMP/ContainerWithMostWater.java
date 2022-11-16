package Java.IMP;

public class ContainerWithMostWater {
    public static int maxArea(int[] h) {
        int x = 0, y = h.length - 1, o = 0;
        while (x < y) {
            o = Math.max(o, Math.min(h[x], h[y]) * (y - x));
            if (h[x] > h[y])
                y--;
            else
                x++;
        }
        return o;
    }

    public static void main(String[] args) {
        int h[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(h));
    }
}

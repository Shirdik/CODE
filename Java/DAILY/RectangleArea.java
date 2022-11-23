package Java.DAILY;

public class RectangleArea {

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a1 = (int) Math.abs(ax1 - ax2) * (int) Math.abs(ay1 - ay2);
        int a2 = (int) Math.abs(bx1 - bx2) * (int) Math.abs(by1 - by2);
        int a3 = 0;
        int x = (-Math.max(ax1, bx1) + Math.min(ax2, bx2));
        int y = (-Math.max(ay1, by1) + Math.min(ay2, by2));
        if (x > 0 && y > 0)
            a3 = x * y;

        return a1 + a2 - a3;
    }

    public static void main(String[] args) {

        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));

    }
}

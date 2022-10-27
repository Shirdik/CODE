package Java.EASY;

public class SquareRoot {

    public static long mySqrt(int x) {
        if (x < 2)
            return x;
        int l = 0;
        int h = x;
        int mid = x / 2;
        while (l < h) {
            if (mid <= x / mid && mid + 1 > x / (mid + 1))
                break;
            else if (mid < x / mid)
                l = mid + 1;
            else
                h = mid - 1;
            mid = l + (h - l) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395601));
    }
}

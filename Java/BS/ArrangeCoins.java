package Java.BS;

public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        long l = 0, h = n;
        while (l < h) {
            long mid = l + (h - l) / 2;
            long t = (mid * (mid + 1)) / 2;
            if (t == n)
                return (int) mid;
            else if (t < n)
                l = mid + 1;
            else
                h = mid;
        }
        return (int) l - 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}

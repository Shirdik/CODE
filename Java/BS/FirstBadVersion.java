package Java.BS;

public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        int l = 1, h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            // if (isBadVersion(mid))
            // h = mid;
            // else
            // l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {

    }
}

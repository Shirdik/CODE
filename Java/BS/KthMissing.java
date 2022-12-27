package Java.BS;

public class KthMissing {
    public static int findKthPositive(int[] arr, int k) {
        int l = 0, len = arr.length, h = len - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] - mid <= k)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return k + l;
    }

    public static void main(String[] args) {

    }
}

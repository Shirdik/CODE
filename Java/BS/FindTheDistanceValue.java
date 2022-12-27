package Java.BS;

import java.util.Arrays;

public class FindTheDistanceValue {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int r = 0, l = arr1.length;
        for (int i = 0; i < l; i++)
            if (isInvalid(arr2, arr1[i], d))
                r++;
        return l - r;
    }

    private static boolean isInvalid(int[] arr2, int i, int d) {
        int l = 0, h = arr2.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int t = arr2[mid] - i;
            if (Math.abs(t) <= d)
                return true;
            else if (t < 0)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

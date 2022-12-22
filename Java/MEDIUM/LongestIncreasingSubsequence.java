package Java.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int r = 1, l = nums.length;
        int[] x = new int[l];
        x[0] = nums[0];
        for (int i = 1; i < l; i++) {
            if (x[r - 1] < nums[i]) {
                x[r++] = nums[i];
            } else {
                int ind = binarySearch(x, nums[i], r);
                x[ind] = nums[i];
            }
        }
        return r;
    }

    private static int binarySearch(int[] x, int i, int h) {
        int l = 0, mid = h / 2;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (x[mid] == i)
                return mid;
            else if (x[mid] < i)
                l = mid + 1;
            else
                h = mid - 1;
        }
        if (l <= h && x[l] < i)
            l++;
        return l;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 4, 5, 6, 7 };
        System.out.println(binarySearch(nums, 3, 6));
    }
}

package Java.BS;

public class MaxDistance {

    public static int maxDistance(int[] nums1, int[] nums2) {
        int r = 0, len1 = nums1.length;
        for (int i = 0; i < len1; i++) {
            int t = maxIndex(nums2, nums1[i]);
            if (t > i)
                r = Math.max(r, t - i);
        }
        return r;
    }

    private static int maxIndex(int[] nums, int target) {
        int h = nums.length - 1, l = 0;
        while (l < h) {
            int mid = l + (h - l + 1) / 2;
            if (nums[mid] < target)
                h = mid - 1;
            else
                l = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 2, 2 }, nums2 = { 10, 10, 1 };
        System.out.println(maxDistance(nums1, nums2));
    }
}

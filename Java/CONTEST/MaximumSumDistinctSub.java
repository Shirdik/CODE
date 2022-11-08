package Java.CONTEST;

public class MaximumSumDistinctSub {

    public static long maximumSubarraySum(int[] nums, int k) {
        long r = nums[0], d = 0, maxi = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                r = 0;
                d = 0;
            } else if (++d < k) {
                r += nums[i];
                System.out.println("+ " + nums[i]);
            } else {
                r += nums[i] - nums[i - k];
                System.out.println("+" + nums[i] + " -" + nums[i - k] + " r=" + r);
            }
            maxi = Math.max(maxi, r);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 5, 4, 2, 9, 9, 9 };
        int nums2[] = { 1, 1, 1, 7, 8, 9 };
        System.out.println(maximumSubarraySum(nums1, 3));
        System.out.println(maximumSubarraySum(nums2, 3));

    }
}

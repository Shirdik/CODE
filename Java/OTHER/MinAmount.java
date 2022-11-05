package Java;

public class MinAmount {

    public static int minAmount(int[] nums) {

        int res = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 1) {
                res += Math.abs(sum) + 1;
                sum = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int nums1[] = { 4, 2, -3 };
        int nums2[] = { -5, 1, 2, 3 };
        int nums3[] = { 4, -6, 1, 1, -8 };
        int nums4[] = { 1 };
        System.out.println(minAmount(nums1) + " " + minAmount(nums2) + " " + minAmount(nums3) + " " + minAmount(nums4));

    }
}

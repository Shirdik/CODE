package Java.DAILY;

public class HouseRobber {

    public static int rob(int[] nums) {
        int l = nums.length;
        if (l == 0)
            return 0;
        else if (l == 1)
            return nums[0];
        else if (l == 2)
            if (nums[0] > nums[1])
                return nums[0];
            else
                return nums[1];
        else {
            int a[] = new int[l];
            a[0] = nums[0];
            a[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < l; i++) {
                a[i] = Math.max((nums[i] + a[i - 2]), a[i - 1]);
            }
            return a[l - 1];
        }
    }

    public int rob1(int[] nums) {
        int prev = 0, last = 0;
        for (int curr : nums)
            last = Math.max(prev + curr, prev = last);
        return last;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 2, 1 };
        System.out.println(rob(nums));

    }
}

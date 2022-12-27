package Java.DAILY;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        return jump(nums, 0, len - 1, dp);
    }

    public static boolean canJump1(int[] nums) {
        int l = nums.length;
        int lastTrue = l - 1;
        for (int i = l - 2; i >= 0; i--) {
            int jumpSize = nums[i];
            if (i + jumpSize >= l - 1 || i + jumpSize >= lastTrue)
                lastTrue = i;
        }
        return lastTrue == 0;
    }

    private static boolean jump(int[] nums, int i, int l, int[] dp) {
        if (i + nums[i] >= l || dp[i] == 1) {
            dp[i] = 1;
            return true;
        } else if (dp[i] == -1 || nums[i] == 0) {
            dp[i] = -1;
            return false;
        } else {
            int x = nums[i];
            boolean r = false;
            for (; x > 0; x--) {
                r = r || jump(nums, x + i, l, dp);
            }
            dp[i] = r == true ? 1 : -1;
            return r;
        }

    }

    public static void main(String[] args) {

    }
}

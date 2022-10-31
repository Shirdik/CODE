package Java.EASY;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1)
                return nums[i - 1] + 1;
        }
        return nums[nums.length - 1] + 1;
    }

    public static int missingNumber1(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++)
            sum -= nums[i];
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        System.out.println(missingNumber1(nums));
    }
}

package Java.CONTEST;

public class OperationsToArray {
    public static void swap(int[] nums, int e, int r) {
        int temp = nums[e];
        nums[e] = nums[r];
        nums[r] = temp;
    }

    public static void moveZeros1(int[] nums) {
        for (int l = 0, c = 0; c < nums.length; c++) {
            if (nums[c] != 0)
                swap(nums, l++, c);
        }

    }

    public static int[] applyOperations(int[] nums) {
        if (nums.length < 2)
            return nums;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] += nums[i];
                nums[i + 1] = 0;
            }
        }
        moveZeros1(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 1, 1, 0 };
        nums = applyOperations(nums);
        for (int i : nums)
            System.out.println(i);

    }
}

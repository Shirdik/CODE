package Java.EASY;

public class MoveZeros {
    public static void moveZeros(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[r] == 0)
                r--;
            if (nums[l] == 0) {
                nums[l] = nums[r];
                nums[r] = 0;
                r--;
            }
            l++;
        }

    }

    public static void shift(int[] nums, int e, int r) {

        for (int i = e; i < r; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

    }

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

    public static void main(String[] args) {
        int nums[] = { 1, 0, 3, 12 };
        moveZeros1(nums);
        for (int i : nums)
            System.out.println(i);

    }
}

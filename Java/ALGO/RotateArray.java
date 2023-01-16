package Java.ALGO;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int len = nums.length, x = nums[0], y = (k - 1) % len, c = 0;
        while (c < len) {
            int z = nums[y];
            nums[y] = x;
            x = z;
            y = (y + k - 1) % len;
            c++;
        }
    }

    public static void rotate1(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int x = nums[len - 1];
            for (int j = len - 1; j > 0; j--)
                nums[j] = nums[j - 1];
            nums[0] = x;
        }
    }

    public static void rotate2(int[] nums, int k) {
        int len = nums.length;
        if (len == 1)
            return;
        rev(nums, 0, len - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, len - 1);
    }

    private static void rev(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

    }
}

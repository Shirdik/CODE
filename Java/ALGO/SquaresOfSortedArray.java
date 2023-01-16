package Java.ALGO;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int x = 0, y = len - 1, r[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (Math.abs(nums[i]) > Math.abs(nums[y])) {
                r[i] = nums[x] * nums[x];
                x++;
            } else {
                r[i] = nums[y] * nums[y];
                y--;
            }
        }
        return r;

    }

    public static void main(String[] args) {

    }
}

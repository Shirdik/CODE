// package Java.EASY;

// public class MoveZeros {
// public static void moveZeros(int[] nums) {

// int l = 0;
// int r = nums.length - 1;
// while (l < r) {
// if (nums[r] == 0)
// r--;
// if (nums[l] == 0) {
// nums[l] = nums[r];
// nums[r] = 0;
// r--;
// }
// l++;
// }

// }

// public static void shift(int[] nums, int e, int r) {

// for (int i = e; i < r; i++) {
// int temp = nums[i];
// nums[i] = nums[i + 1];
// nums[i + 1] = temp;
// }

// }

// // public static void moveZeros1(int[] nums) {
// // int r = nums.length - 1;
// // while() {
// // if (nums[i] == 0)
// // shift(nums, i, r--);
// // }
// // }

// public static void main(String[] args) {

// int nums[] = { 0, 0, 1 };
// moveZeros1(nums);
// for (int i : nums)
// System.out.println(i);

// }
// }

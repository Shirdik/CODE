package Java.OTHER;

public class SearchRotatedSortedArray {
    public static int rotated(int[] nums) {
        int l = 0, h = nums.length - 1, n = nums.length;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            } else if (nums[h] >= nums[mid])
                h = mid - 1;
            else if (nums[l] <= nums[mid])
                l = mid + 1;

        }
        return 0;
    }

    public static int search(int[] nums, int target) {

        int min = rotated(nums);
        int x = binarySearch(nums, 0, min - 1, target);
        int y = binarySearch(nums, min, nums.length - 1, target);
        return x > y ? x : y;

    }

    public static int binarySearch(int[] nums, int l, int h, int target) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int nums1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(search(nums, 0));

    }
}

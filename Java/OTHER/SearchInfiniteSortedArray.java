package Java.OTHER;

public class SearchInfiniteSortedArray {

    public static int search(int[] nums, int target) {
        int l = 0, h = 1;
        while (nums[h] < target) {
            l = h;
            h *= 2;
        }
        return binarySearch(nums, l, h, target);
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

    }
}

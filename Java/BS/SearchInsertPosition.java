package Java.BS;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int l = 0, len = nums.length, h = len - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {

    }

}

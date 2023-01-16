package Java.BS;

public class FindMinRotatedArray {

    public static int findMin(int[] nums) {
        int l = 0, len = nums.length, h = len - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid == 0)
                if (nums[mid] < nums[mid + 1])
                    return nums[mid];
                else if (mid == len - 1) {
                    if (nums[mid] < nums[mid - 1])
                        return nums[mid];
                } else {
                    if (nums[mid] <= nums[mid - 1] && nums[mid] <= nums[mid + 1]) {
                        return nums[mid];
                    } else if (nums[h] < nums[mid])
                        h = mid - 1;
                    else if (nums[l] < nums[mid])
                        l = mid + 1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}

package Java.BS;

public class PeakElement {

    public static int peakIndexInMountainArray(int[] nums) {
        int l = 0, len = nums.length, h = len - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid == 0) {
                if (nums[mid] > nums[mid + 1])
                    return mid;
            } else if (mid == len - 1) {
                if (nums[mid] > nums[mid - 1])
                    return mid;
            } else {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                    return mid;
                else if (nums[mid] < nums[mid - 1])
                    h = mid;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}

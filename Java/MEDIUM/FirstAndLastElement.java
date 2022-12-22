package Java.MEDIUM;

public class FirstAndLastElement {
    public static int[] searchRange(int[] nums, int target) {
        int r[] = { -1, -1 };
        if (nums == null)
            return r;
        else {
            r[0] = edgeElement(nums, target, true);
            r[1] = edgeElement(nums, target, false);
        }
        return r;
    }

    private static int edgeElement(int[] nums, int target, boolean isLeft) {
        int l = 0, h = nums.length - 1, mid = h / 2, r = -1;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                r = mid;
                if (isLeft)
                    h = mid - 1;
                else
                    l = mid + 1;
            } else if (nums[mid] < target)
                l = mid + 1;
            else if (nums[mid] > target)
                h = mid - 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] r = searchRange(nums, 8);
        System.out.println(r[0] + " " + r[1]);
    }
}

package Java.BS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len2 < len1)
            return intersect(nums2, nums1);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l = 0;
        List<Integer> list = new LinkedList<>();
        for (int i : nums1) {
            int r = bs(nums2, l, i);
            if (r != -1) {
                list.add(i);
                l = r + 1;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    private static int bs(int[] nums, int l, int i) {
        int len = nums.length, h = len - 1, index = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == i) {
                index = mid;
                h = mid - 1;
            } else if (nums[mid] > i)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}

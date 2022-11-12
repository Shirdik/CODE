package Java.CONTEST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class MaximumSumDistinctSub {

    public static long maximumSubarraySum(int[] nums, int k) {
        long r = nums[0], d = 0, maxi = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                r = 0;
                d = 0;
            } else if (++d < k) {
                r += nums[i];
                System.out.println("+ " + nums[i]);
            } else {
                r += nums[i] - nums[i - k];
                System.out.println("+" + nums[i] + " -" + nums[i - k] + " r=" + r);
            }
            maxi = Math.max(maxi, r);
        }
        return maxi;
    }

    public static long max(int[] nums, int k) {
        int i = 0, j = 0;
        long o = 0, t = 0;
        Map<Integer, Integer> m = new HashMap<>();
        // Queue<Integer> m = new LinkedList<>();
        // Set<Integer> s = new HashSet<>();
        while (j < nums.length) {
            t += nums[j];
            if (!m.containsKey(nums[j]))
                m.put(nums[j], 1);
            else
                m.put(nums[j], m.get(nums[j]) + 1);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (m.size() == k) {
                    o = Math.max(o, t);
                }
                t -= nums[i];
                m.put(nums[i], m.get(nums[i]) - 1);
                if (m.get(nums[i]) == 0)
                    m.remove(nums[i]);
                i++;
                j++;
            }

        }
        return o;

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 5, 4, 2, 9, 9, 9 };
        int nums2[] = { 1, 1, 1, 7, 8, 9 };
        System.out.println(max(nums1, 3));
        System.out.println(max(nums2, 3));

    }
}

package Java.DAILY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import Java.OTHER.ListNode;

public class SumSubArrayMinimums {

    // public static int sumSubArrayMins(int[] arr) {
    // int o = 0, i = 0, j = arr.length - 1;
    // while (j < arr.length) {

    // }
    // }
    public ListNode removeNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        int max = l.get(l.size() - 1);
        for (int i = l.size(); i > 0; i--) {
            if (max > l.get(i))
                l.remove(i);
            else
                max = l.get(i);
        }
        ListNode x = new ListNode();
        ListNode y = x;
        for (int i : l) {
            y.next = new ListNode(i);
            y = y.next;
        }
        return x.next;
    }

    public static int countSubarrays(int[] nums, int k) {
        int i = 0, j = 0, o = 0;
        while (j < nums.length) {
            int x[] = sorted(nums, i, j);
            int med = (j - i) / 2;
            if (x[med] == k || (j < nums.length && nums[j] == k))
                o++;
            if (j < nums.length - 1 || i == nums.length - 2)
                j++;
            else
                i++;
        }

        return o;
    }

    public static int[] sorted(int[] nums, int i, int j) {
        if (i == j) {
            int x[] = { nums[0] };
            return x;
        } else {
            int d = j - i;
            int o[] = new int[j - i];
            for (int x = 0; x < d; x++)
                o[x] = nums[i++];
            Arrays.sort(o);
            for (int x = 0; x < o.length; x++)
                System.out.println(o[x]);
            System.out.println();
            return o;
        }
    }

    public static void main(String[] args) {
        // int nums[] = { 3, 2, 1, 4, 5 };
        // int nums[] = { 2, 3, 1 };
        // // System.out.println(sorted(nums, 0, 4));
        // System.out.println(countSubarrays(nums, 3));

        // Set<Integer> s = new HashSet<>();
        // List<Integer> l = new LinkedList<>();

    }
}

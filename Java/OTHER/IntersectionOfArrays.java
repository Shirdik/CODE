package Java;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int nums1[] = { 1, 1 };
        int nums2[] = { 1, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int x : nums1.length > nums2.length ? nums2 : nums1) {
            int j = 0;
            for (int y : nums1.length > nums2.length ? nums1 : nums2) {
                System.out.println(x + " " + y);
                if (x == y && !list1.contains(j)) {
                    list.add(x);
                    list1.add(j);
                    break;
                }
                j++;
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int x : list) {
            res[i] = x;
            i++;
        }
        for (int x : res)
            System.out.println(x);

    }

}

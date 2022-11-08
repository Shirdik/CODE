package Java.OTHER;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = { 2, 5, 6, 0, 0, 0 };
        int nums2[] = { 1, 2, 3 };
        int m = 3;
        int n = 3;
        int final1 = n + m - 1;
        m--;
        n--;
        // int nums3[] = nums1;s
        while (final1 >= 0) {
            if (m >= 0 && n >= 0)
                nums1[final1--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            else if (m >= 0)
                nums1[final1--] = nums1[m--];
            else
                nums1[final1--] = nums2[n--];
        }
        // nums1 = nums3;

        for (int x : nums1)
            System.out.println(x);

    }
}

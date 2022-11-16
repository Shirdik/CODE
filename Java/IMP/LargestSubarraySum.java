package Java.IMP;

public class LargestSubarraySum {

    public static int largestSub(int n[], int k) {

        int i = 0, j = 0, o = 0;
        long sum = 0;
        while (j < n.length) {
            sum += n[j];
            if (sum == k) {
                o = Math.max(j - i + 1, o);
            }
            while (sum > k) {
                sum -= n[i];
                i++;
            }

            j++;
        }
        return o;

    }

    public static void main(String[] args) {
        int[] n = { 4, 1, 1, 1, 2, 3, 5 };
        int[] m = { -5, 8, -14, 2, 4, 12 };
        System.out.println(largestSub(n, 5));
        // System.out.println(largestSub(m, -5));

    }
}

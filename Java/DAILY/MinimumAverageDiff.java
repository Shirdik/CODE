
package Java.DAILY;

public class MinimumAverageDiff {
    public static int minimumAverageDiff(int[] nums) {
        int l = nums.length, pre[] = new int[l], o = Integer.MAX_VALUE, r = 0;
        pre[0] = nums[0];
        for (int i = 1; i < l; i++) {
            pre[i] = nums[i] + pre[i - 1];
        }
        for (int i = 0; i < l; i++) {
            long pr = 0, su = 0;
            if (i < l - 1)
                su = ((pre[l - 1] - pre[i]) / (l - 1 - i));
            pr = (pre[i] / (i + 1));
            int x = (int) Math.abs(pr - su);
            if (o > x) {
                o = x;
                r = i;
            }
        }

        return r;
    }

    public static int minimumAverageDiff1(int[] nums) {
        int l = nums.length, t = 0, c = 0, o = Integer.MAX_VALUE, r = 0;
        for (int i = 1; i < l; i++) {
            t += nums[i];
        }
        for (int i = 0; i < l; i++) {
            c += nums[i];
            long la = c / (i + 1), ra = 0;
            if (i < l - 1)
                ra = (t - c) / (l - i - 1);
            System.out.println(la + " " + ra);
            int a = (int) Math.abs(la - ra);
            if (o > a) {
                o = a;
                r = i;
            }
        }
        return r;
    }

    public static int minimumAverageDiff2(int[] nums) {
        int l = nums.length;
        int r = -1;
        int o = Integer.MAX_VALUE;
        long c = 0;

        long t = 0;
        for (int i = 0; i < l; ++i) {
            t += nums[i];
        }

        for (int i = 0; i < l; ++i) {
            c += nums[i];
            long la = c;
            la /= (i + 1);
            long ra = t - c;
            if (i != l - 1) {
                ra /= (l - i - 1);
            }
            int x = (int) Math.abs(la - ra);
            if (x < o) {
                o = x;
                r = i;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        int nums[] = { 2, 5, 3, 9, 5, 3 };
        System.out.println(minimumAverageDiff1(nums));

    }
}

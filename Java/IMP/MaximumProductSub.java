package Java.IMP;

public class MaximumProductSub {
    public static int maxProduct(int[] n) {
        int o = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length - 1; j++) {
                int temp = n[i] * n[j];
                if (o == 0)
                    o = Math.max(o, o + temp);
                else
                    o = Math.max(o, o * temp);
            }
        }
        return o;
    }

    public static int maxProduct1(int[] A) {
        int n = A.length, res = A[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l = (l == 0 ? 1 : l) * A[i];
            r = (r == 0 ? 1 : r) * A[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }

    public static void main(String[] args) {

        int n[] = { -4, -3 };

        System.out.println(maxProduct1(n));

    }
}

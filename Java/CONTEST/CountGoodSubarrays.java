package Java.CONTEST;

import java.util.HashMap;

public class CountGoodSubarrays {
    public long countGood(int[] nums, int k) {
        long res = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int len = nums.length, x = 0;
        for (int j = 0; j < len; j++) {
            int n = nums[j];
            m.put(n, m.getOrDefault(n, 0) + 1);
            if (m.get(n) >= 2)
                x += comb(n);
            if (x >= k)
                res++;
        }
        for (int j = 0; j < len; j++) {
            int n = nums[j];
            m.put(n, m.getOrDefault(n, 0) - 1);
            if (m.get(n) >= 2)
                x = (x - comb(m.get(n) + 1)) + comb(m.get(n));
            if (x >= k)
                res++;
        }
        return res;
    }

    private int comb(int i) {
        return fact(i) / (2 * fact(i - 2));
    }

    private int fact(int i) {
        if (i == 1)
            return 1;
        else
            return i * fact(i - 1);
    }

}

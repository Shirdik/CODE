package Java.ALGO;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        fun(1, n, k, l, new ArrayList<Integer>());
        return l;
    }

    private static void fun(int i, int n, int k, List<List<Integer>> res, List<Integer> t) {
        if (k == 0) {
            res.add(new ArrayList<>(t));
            return;
        } else {
            for (int j = i; j <= n - k + 1; j++) {
                t.add(j);
                fun(j + 1, n, k - 1, res, t);
                t.remove(t.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}

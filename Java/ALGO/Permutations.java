package Java.ALGO;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        fun(0, nums, nums.length, new ArrayList<Integer>(), res);
        return res;

    }

    private void fun(int i, int[] nums, int length, ArrayList<Integer> t, List<List<Integer>> res) {
        if (t.size() == length) {
            res.add(new ArrayList<>(t));
            return;
        } else {
            for (int j = i; j < i + length; j++) {
                int m = nums[j % length];
                if (!t.contains(m)) {
                    t.add(m);
                    fun(i + 1, nums, length, t, res);
                    t.remove(t.size() - 1);
                }
            }
        }
    }
}

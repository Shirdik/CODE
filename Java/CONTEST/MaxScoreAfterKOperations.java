package Java.CONTEST;

import java.util.PriorityQueue;

public class MaxScoreAfterKOperations {

    public long maxKelments(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>((a, b) -> a - b < 0 ? 1 : -1);
        int len = nums.length;
        long r = 0;
        for (int i = 0; i < len; i++)
            q.add(Long.valueOf(nums[i]));
        while (k-- > 0) {
            Long t = q.poll();
            r += t;
            q.add((t / 3) + 1);
        }
        return r;
    }
}

package Java.CONTEST;

public class DiffElementAndDIgitSum {
    public int differenceOfSum(int[] nums) {
        int len = nums.length;
        long sum = 0, dsum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            dsum += fun(nums[i]);
        }
        return (int) Math.abs(sum - dsum);
    }

    private long fun(int i) {
        long r = 0;
        while (i != 0) {
            r += i % 10;
            i /= 10;
        }
        return r;
    }
}

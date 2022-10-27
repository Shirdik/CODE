package Java.EASY;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int c = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                c++;
                r = nums[i];
            } else if (r == nums[i])
                c++;
            else
                c--;
        }
        return r;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}

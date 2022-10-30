package Java.CONTEST;

public class SecondGreaterInteger {
    public static int[] secondGreaterInteger(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 2;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {

                    if (count == 1)
                        output[i] = nums[j];
                    count--;
                }
            }
            if (count > 0)
                output[i] = -1;
        }
        return output;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 0, 9, 6 };
        int out[] = secondGreaterInteger(nums);
        for (int i : out)
            System.out.println(i);

    }
}

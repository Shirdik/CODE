package Java.EASY;

public class SingleNumber {

    public static int single(int nums[]) {
        int a = 0;
        for (int i = 0; i < nums.length; i++)
            a ^= nums[i];
        return a;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 1 };
        System.out.println(single(nums));
    }
}

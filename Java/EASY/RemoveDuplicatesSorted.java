package Java.EASY;

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                res++;
            else
                nums[i - res] = nums[i];
        }
        return (nums.length - res);
    }

    public static int removeDuplicates1(int[] nums) {
        int res = 0;
        if (nums.length > 0)
            res = 1;
        for (int i : nums)
            if (i > nums[res - 1])
                nums[res++] = i;
        return (res);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        System.out.println("LENGTH: " + removeDuplicates1(nums));
        for (int i = 0; i < removeDuplicates1(nums); i++)
            System.out.println(nums[i]);
    }
}

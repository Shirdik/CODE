package Java.OTHER;

public class TwoSum {
    public static void main(String[] args) {
        int res[] = { 0, 0 };
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] + nums[j] == target) {
                    res[0] = Math.min(i, j);
                    res[1] = Math.max(i, j);
                    break;
                }
            }
        }
        System.out.println(res[0] + ", " + res[1]);
    }
}

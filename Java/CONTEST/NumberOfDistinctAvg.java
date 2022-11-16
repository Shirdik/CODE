package Java.CONTEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfDistinctAvg {

    public static int distictAverages(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, c = 0;
        List<Double> l = new ArrayList<>();
        while (i < nums.length / 2) {
            double t = (Double.valueOf(nums[i]) + Double.valueOf(nums[j])) / 2;
            if (!l.contains(t)) {
                c++;
                l.add(t);
            }
            i++;
            j--;
        }
        return c;
    }

    public static void main(String[] args) {
        // int nums[] = { 4, 1, 4, 0, 3, 5 };
        int nums1[] = { 9, 5, 7, 8, 7, 9, 8, 2, 0, 7 };
        System.out.println(distictAverages(nums1));
    }
}

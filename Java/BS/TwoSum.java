package Java.BS;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        if (numbers.length == 2) {
            r[0] = 1;
            r[1] = 2;
            return r;
        } else {
            int l = 0, h = numbers.length - 1;
            while (l <= h) {
                int sum = numbers[l] + numbers[h];
                int mid = l + (h - l) / 2;
                if (sum == target) {
                    r[0] = l + 1;
                    r[1] = h + 1;
                    return r;
                } else if (sum < target)
                    l = numbers[mid] + numbers[h] < target ? mid : l + 1;
                else
                    h = numbers[l] + numbers[mid] > target ? mid : h - 1;
            }
            return r;
        }
    }

    public static void main(String[] args) {

    }
}

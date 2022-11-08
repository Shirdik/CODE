package Java.OTHER;

import java.util.Arrays;

public class Spaceship {

    public static int minUnstability(int x, int[] arr) {
        int res = 0;
        int maxi = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            maxi = Math.max(maxi, temp);
            res += temp;
        }
        res -= maxi;
        return res;
    }

    public static void main(String[] args) {
        int x = 4;
        int passengers[] = { 1, 3, 2, 40, 44, 45 };
        System.out.println(minUnstability(x, passengers));

    }
}

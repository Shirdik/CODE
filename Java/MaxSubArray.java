package Java;

import java.util.*;

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int temp = arr[0];
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {

            temp = Math.max(arr[i] + temp, arr[i]);
            maxi = Math.max(maxi, temp);
        }
        System.out.println(maxi);
    }

}

package Java.BS;

import java.util.Arrays;

public class CheckIfNandDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        int len = arr.length;
        if (len == 0)
            return false;
        else {
            Arrays.sort(arr);
            for (int i : arr) {
                if (bs(arr, len, i * 2))
                    return true;
            }
            return false;
        }
    }

    private static boolean bs(int[] arr, int len, int i) {
        if (arr[len - 1] < i)
            return false;
        else {
            int l = 0, h = len - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr[mid] == i)
                    return true;
                else if (arr[mid] < i)
                    l = mid + 1;
                else
                    h = mid - 1;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr));
        System.out.println(bs(arr, 4, 10));
    }
}

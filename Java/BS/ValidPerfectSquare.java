package Java.BS;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        else if (num == 2)
            return false;
        else {
            int l = 0, h = num / 2;
            while (l <= h) {

                int mid = l + (h - l) / 2;
                if (mid * mid == num)
                    return true;
                else if (mid > num / mid)
                    h = mid - 1;
                else
                    l = mid + 1;

            }
            return false;
        }
    }

    public static void main(String[] args) {

    }

}

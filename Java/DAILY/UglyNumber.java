package Java.DAILY;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n < 0)
            return false;
        for (int i : new int[] { 2, 3, 5 }) {
            while (n % i == 0)
                n /= i;
        }
        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println(isUgly(6));

    }
}

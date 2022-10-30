package Java.EASY;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static int digitSquares(int n) {
        if (n == 0)
            return 0;
        return (int) Math.pow(n % 10, 2) + digitSquares(n / 10);
    }

    public static boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while (n != 1) {
            if (s.contains(n))
                return false;
            s.add(n);
            n = digitSquares(n);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));

    }

}

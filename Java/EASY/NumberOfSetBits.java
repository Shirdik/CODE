package Java.EASY;

public class NumberOfSetBits {
    public static int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n &= n - 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}

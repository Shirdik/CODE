package Java.EASY;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (index >= 0 && digits[index] == 9) {
            digits[index--] = 0;
        }
        if (index == -1) {
            int temp[] = new int[digits.length + 1];
            temp[0] = 1;
            return temp;
        } else
            digits[index]++;
        return digits;
    }

    public static void main(String[] args) {

        int digits[] = { 9, 9, 9, 9 };
        int res[] = plusOne(digits);
        for (int x : res)
            System.out.println(x);

    }
}

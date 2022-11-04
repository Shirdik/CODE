package Java.EASY;

public class ReverseString {

    public static void reverseString(char[] s) {
        if (s.length < 2)
            return;
        for (int i = 0; i <= s.length / 2 - 1; i++) {
            char x = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - 1 - i] = x;
        }
    }

    public static void main(String[] args) {

        char[] s = { 'h', 'e', 'x', 'l', 'o' };
        reverseString(s);
        for (char x : s)
            System.out.println(x);

    }

}

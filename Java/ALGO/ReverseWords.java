package Java.ALGO;

public class ReverseWords {

    public static String reversewords(String s) {
        StringBuilder sb = new StringBuilder();
        int x = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                rev(sb, s, x, i - 1);
                x = i + 1;
            }
        }
        rev(sb, s, x, len - 1);
        return sb.toString().substring(0, len);
    }

    private static void rev(StringBuilder sb, String s, int x, int i) {
        while (i >= x)
            sb.append(s.charAt(i--));
        sb.append(" ");
    }

    public static void main(String[] args) {
        String s = "Le's take a leetcode contest";
        System.out.println(reversewords(s));
    }
}

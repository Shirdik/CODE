package Java.DAILY;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] sa = s.split("\\s+");
        for (int i = sa.length - 1; i >= 0; i--) {
            sb.append(sa[i]);
            if (i != 0)
                sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("-" + reverseWords("  hello world  ") + "-");
    }
}

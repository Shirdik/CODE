package Java.EASY;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuffer res = new StringBuffer(s);
        return s.equals(res.reverse().toString());
    }

    public static boolean isPalindrome1(String s) {
        char res[] = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j;) {
            while (!Character.isLetterOrDigit(res[i]))
                i++;
            while (!Character.isLetterOrDigit(res[j]))
                j--;
            if (Character.toLowerCase(res[i++]) != Character.toLowerCase(res[j--]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
    }
}

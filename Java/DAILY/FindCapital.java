package Java.DAILY;

public class FindCapital {

    public static boolean detectCaptialUse(String word) {
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;
        else if (word.charAt(0) - 'A' >= 0) {
            char[] a = word.toCharArray();
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(a[i]))
                    return false;
            }
            return true;
        }
        return false;

    }

    public static boolean detectCaptialUse1(String word) {
        int len = word.length();
        if (len == 1)
            return true;
        else {
            if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
                for (int i = 1; i < len; i++)
                    if (Character.isLowerCase(word.charAt(i)))
                        return false;
                return true;
            } else {
                for (int i = 1; i < len; i++)
                    if (Character.isUpperCase(word.charAt(i)))
                        return false;
                return true;
            }
        }
    }

    public static void main(String[] args) {
    }
}

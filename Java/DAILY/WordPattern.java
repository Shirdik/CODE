package Java.DAILY;

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");
        int plen = pattern.length(), slen = a.length;
        if (plen != slen)
            return false;
        else {
            HashMap<Character, String> m = new HashMap<>();
            for (int i = 0; i < plen; i++) {
                char ch = pattern.charAt(i);
                boolean containsKey = m.containsKey(ch);
                if ((m.containsValue(a[i]) && !containsKey))
                    return false;
                if (containsKey && !m.get(ch).equals(a[i]))
                    return false;
                else
                    m.put(ch, a[i]);

            }
            return true;
        }
    }
}

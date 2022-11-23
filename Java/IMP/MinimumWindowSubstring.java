package Java.IMP;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.length() < t.length() || s.length() == 0)
            return "";

        int i = 0, j = 0, oi = 0, l = Integer.MAX_VALUE;
        Map<Character, Integer> m = new HashMap<>();
        for (char x : t.toCharArray()) {
            m.computeIfPresent(x, (e, v) -> v + 1);
            m.computeIfAbsent(x, e -> 1);
        }
        int c = m.size();
        char a[] = s.toCharArray();
        while (j < s.length()) {
            m.computeIfPresent(a[j], (e, v) -> v - 1);
            if (m.containsKey(a[j]) && m.get(a[j]) == 0)
                c--;
            while (c == 0) {
                if (l > j - i + 1) {
                    l = j - i + 1;
                    oi = i;
                }
                if (m.containsKey(a[i])) {
                    if (m.get(a[i]) == 0)
                        c++;
                    m.computeIfPresent(a[i], (e, v) -> v + 1);
                }
                i++;
            }
            j++;
        }
        if (l > s.length())
            return "";
        return s.substring(oi, oi + l);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}

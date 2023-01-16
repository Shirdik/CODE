package Java.ALGO;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static boolean chechInclusion(String s1, String s2) {
        Map<Character, Integer> m = new HashMap<>();
        for (char x : s1.toCharArray())
            m.put(x, m.getOrDefault(x, 0) + 1);
        int i = 0, j = 0, len1 = s1.length(), len2 = s2.length(), c = 0;
        while (j < len2) {
            char x = s2.charAt(i);
            char y = s2.charAt(j);
            if (j - i + 1 < len1) {
                if (m.containsKey(y)) {
                    int v2 = m.get(y);
                    m.put(y, --v2);
                    if (v2 == 0)
                        c++;
                } else {
                    while (i < j) {
                        if (m.containsKey(x)) {
                            int v1 = m.get(x);
                            if (c > 0 && v1 == 0)
                                c--;
                            m.put(s2.charAt(i), ++v1);
                        }
                        i++;
                    }
                }
            } else {
                if (j - i + 1 == len1) {
                    if (c == m.size())
                        return true;
                }
                if (m.containsKey(x)) {
                    int v1 = m.get(x);
                    if (v1 == 0)
                        c++;
                    m.put(x, ++v1);
                }
                i++;
            }
            j++;

        }
        return false;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2)
            return false;
        else {
            HashMap<Character, Integer> m1 = new HashMap<>();
            for (int i = 0; i < len1; i++)
                m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0) + 1);
            System.out.println(m1);
            for (int i = 0; i <= len2 - len1; i++) {
                HashMap<Character, Integer> m2 = new HashMap<>();
                for (int j = i; j < i + len1; j++)
                    m2.put(s2.charAt(j), m2.getOrDefault(s2.charAt(j), 0) + 1);
                System.out.println(m2);
                if (matches(m1, m2))
                    return true;
            }
            return false;
        }

    }

    private static boolean matches(HashMap<Character, Integer> m1, HashMap<Character, Integer> m2) {
        for (char x : m1.keySet()) {
            if (m1.get(x) - m2.getOrDefault(x, -1) != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}

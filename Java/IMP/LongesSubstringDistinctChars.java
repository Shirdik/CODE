package Java.IMP;

import java.util.HashSet;
import java.util.Set;

public class LongesSubstringDistinctChars {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, o = 0;
        Set<Character> st = new HashSet<>();
        while (j < s.length()) {
            if (!st.contains(s.charAt(j))) {
                st.add(s.charAt(j));
                o = Math.max(st.size(), o);
            } else {
                st.remove(s.charAt(i++));
            }
            j++;
        }
        return o;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}

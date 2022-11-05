package Java.EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        if (s.length() < 2)
            return s;
        List<Character> l = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder r = new StringBuilder();
        r.append(s);
        int h = s.length() - 1;
        for (int i = 0; i < h; i++) {
            while (!l.contains(r.charAt(h)) && h > 0)
                h--;
            if (l.contains(r.charAt(i))) {
                char temp = r.charAt(i);
                r.setCharAt(i, r.charAt(h));
                r.setCharAt(h, temp);
                h--;
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseVowels("a.b,."));

    }
}

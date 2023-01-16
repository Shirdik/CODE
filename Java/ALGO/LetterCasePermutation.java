package Java.ALGO;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        fun(0, s.length(), res, s.toCharArray());
        return res;
    }

    private void fun(int i, int length, List<String> res, char[] s) {
        if (i == length)
            res.add(new String(s));
        else {
            if (Character.isLetter(s[i])) {
                s[i] = Character.toLowerCase(s[i]);
                fun(i + 1, length, res, s);
                s[i] = Character.toUpperCase(s[i]);
                fun(i + 1, length, res, s);
            } else
                fun(i + 1, length, res, s);
        }
    }
}

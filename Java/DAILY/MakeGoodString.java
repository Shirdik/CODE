package Java.DAILY;

import java.util.Stack;

public class MakeGoodString {

    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.lastElement() - c == 32)
                st.pop();
            else
                st.add(c);
        }
        StringBuilder o = new StringBuilder();
        for (char i : st)
            o.append(i);
        return o.toString();
    }

    public static void main(String[] args) {

        System.out.println(makeGood("leEeetcode"));

    }
}

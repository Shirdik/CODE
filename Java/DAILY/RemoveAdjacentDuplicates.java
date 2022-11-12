package Java.DAILY;

import java.rmi.registry.Registry;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (!st.empty() && st.peek() == x)
                st.pop();
            else
                st.push(x);
        }
        StringBuilder sb = new StringBuilder();
        for (char x : st)
            sb.append(x);
        return sb.toString();
    }

    public static String removeDups(String s) {
        int i = 0;
        char[] a = s.toCharArray();
        for (int j = 0; j < s.length(); j++, i++) {
            a[i] = a[j];
            if (i > 0 && a[i] == a[i - 1])
                i -= 2;
        }
        return new String(a, 0, i);
    }

    public static void main(String[] args) {
        System.out.println(removeDups("aabbb"));

    }
}

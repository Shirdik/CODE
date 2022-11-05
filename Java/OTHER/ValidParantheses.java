package Java;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            } else if (stack.empty())
                return false;
            else if (Math.abs(stack.pop() - s.charAt(i)) > 2)
                return false;
        }

        return stack.empty();
    }

    public static boolean isValid1(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[')
                stack.push(']');
            else if (s.charAt(i) == '{')
                stack.push('}');
            else if (s.charAt(i) == '(')
                stack.push(')');
            else if (stack.empty())
                return false;
            else if (s.charAt(i) != stack.pop())
                return false;
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("}"));
    }
}

package Java.DAILY;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String x : tokens) {
            if (x.equals("+"))
                s.push(s.pop() + s.pop());
            else if (x.equals("-"))
                s.push(s.pop() - s.pop());
            else if (x.equals("*"))
                s.push(s.pop() * s.pop());
            else if (x.equals("-"))
                s.push(s.pop() * s.pop());
            else
                s.push(Integer.valueOf(x));
        }
        return s.pop();
    }

    public static void main(String[] args) {
    }
}

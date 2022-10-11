package Java;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.empty())
            temp.push(stack.pop());
        int res = temp.pop();
        while (!temp.empty())
            stack.push(temp.pop());
        return res;
    }

    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.empty())
            temp.push(stack.pop());
        int res = temp.peek();
        while (!temp.empty())
            stack.push(temp.pop());
        return res;
    }

    public boolean empty() {
        return stack.empty();
    }
}

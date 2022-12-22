package Java.DAILY;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatues {

    public static int[] dailyTemperatues(int[] temperatures) {
        Map<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int l = temperatures.length;
        for (int i = 0; i < l; i++) {
            while (!s.empty() && temperatures[s.peek()] < temperatures[i])
                m.put(s.peek(), i - s.pop());
            s.push(i);
        }
        int[] r = new int[l];
        for (int i = 0; i < l; i++)
            r[i] = m.getOrDefault(i, 0);
        return r;
    }

    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        
    }
}
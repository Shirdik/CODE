package Java.ALGO;

import java.util.HashMap;

public class MinRoundsToCompleteTasks {
    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int c = 0, len = tasks.length;
        for (int i = 0; i < len; i++) {
            m.put(tasks[i], m.getOrDefault(tasks[i], 0) + 1);
        }
        for (int t : m.values()) {
            if (t == 1)
                return -1;
            else
                c += (t + 2) / 3;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] tasks = { 66, 66, 63, 61, 63, 63, 64, 66, 66, 65, 66, 65, 61, 67, 68, 66, 62, 67, 61, 64, 66, 60, 69, 66,
                65, 68, 63, 60, 67, 62, 68, 60, 66, 64, 60, 60, 60, 62, 66, 64, 63, 65, 60, 69, 63, 68, 68, 69, 68,
                61 };
        System.out.println(minimumRounds(tasks));
    }
}

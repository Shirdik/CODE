package Java.DAILY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinTimeToCollect {

    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer, int[]> m = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int[] t = m.getOrDefault(edges[i][0], new int[2]);
            t[t[0] == 0 ? 0 : 1] = edges[i][1];
            m.put(edges[i][0], t);
        }
        return dfs(m, 0, hasApple);

    }

    private static int dfs(HashMap<Integer, int[]> m, int i, List<Boolean> hasApple) {
        if (!m.containsKey(i))
            return hasApple.get(i) ? 2 : 0;
        else {
            boolean apple = hasApple.get(i);
            int l = dfs(m, m.get(i)[0], hasApple);
            int r = dfs(m, m.get(i)[1], hasApple);
            if (i == 0)
                return l + r;
            else
                return l > 0 || r > 0 || apple ? l + r + 2 : 0;
        }
    }

    public static void main(String[] args) {
        int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 4 }, { 1, 5 }, { 2, 3 }, { 2, 6 } };
        List<Boolean> l = Arrays.asList(false, false, true, false, false, true, false);
        System.out.println(minTime(7, edges, l));
    }

}

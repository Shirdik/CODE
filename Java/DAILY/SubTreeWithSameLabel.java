package Java.DAILY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubTreeWithSameLabel {
    int[] r;

    public int[] countSubTree(int n, int[][] edges, String labels) {
        r = new int[n];
        char[] label = labels.toCharArray();
        HashMap<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = edges[i][0], b = edges[i][1];
            m.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            m.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }
        dfs(0, -1, m, label);
        return r;
    }

    private int[] dfs(int i, int j, HashMap<Integer, List<Integer>> m, char[] label) {
        int[] nodeCounts = new int[26];
        nodeCounts[label[i] - 'a'] = 1;
        if (!m.containsKey(i))
            return nodeCounts;
        else {
            for (int child : m.get(i)) {
                if (child == j)
                    continue;
                int[] childCounts = dfs(child, i, m, label);
                for (int x = 0; x < 26; x++)
                    nodeCounts[x] += childCounts[x];
            }
        }
        r[i] = nodeCounts[label[i] - 'a'];
        return nodeCounts;

    }

}

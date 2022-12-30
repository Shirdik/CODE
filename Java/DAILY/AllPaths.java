package Java.DAILY;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> l = new ArrayList<>();
        if (graph.length == 0 || graph[0].length == 0)
            return l;
        List<Integer> t = new ArrayList<>();
        t.add(0);
        dfs(graph, 0, l, t);
        return l;

    }

    private static void dfs(int[][] graph, int i, List<List<Integer>> l, List<Integer> t) {
        if (i == graph[0].length - 1)
            l.add(new ArrayList<>(t));
        else {
            for (int j : graph[i]) {
                t.add(j);
                dfs(graph, j, l, t);
                t.remove(t.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

    }
}

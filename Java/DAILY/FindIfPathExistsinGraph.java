package Java.DAILY;

public class FindIfPathExistsinGraph {
    class DisjointSetUnion {
        private int N;
        private int[] parent;

        public DisjointSetUnion(int n) {
            N = n;
            parent = new int[n];
            for (int i = 0; i < n; i++)
                parent[i] = i;
        }

        public boolean areConnected(int x, int y) {
            return find(x) == find(y);
        }

        private int find(int x) {
            int y = x;
            while (y != parent[y]) {
                y = parent[y];
            }
            parent[x] = y;
            return y;
        }

        public void union(int x, int y) {
            if (x != y) {
                int a = find(x);
                int b = find(y);
                parent[a] = b;
            }
        }

    }

    class Solution {

        public boolean validPath(int n, int[][] edges, int source, int destination) {
            DisjointSetUnion s = new DisjointSetUnion(n);
            for (int[] edge : edges) {
                s.union(edge[0], edge[1]);
            }
            return s.areConnected(source, destination);
        }
    }

    public static void main(String[] args) {

    }
}

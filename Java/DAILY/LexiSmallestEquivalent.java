package Java.DAILY;

public class LexiSmallestEquivalent {
    class uni {
        int[] arr;

        uni() {
            arr = new int[26];
            for (int i = 0; i < 26; i++)
                arr[i] = i;
        }

        void union(int a, int b) {
            int x = find(a);
            int y = find(b);
            if (x < y)
                arr[y] = x;
            else
                arr[x] = y;
        }

        int find(int a) {
            int x = a, min = 26;
            while (arr[a] != a) {
                a = arr[a];
                min = Math.min(min, a);
            }
            arr[x] = a;
            if (x == a)
                return a;
            return min;
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int len = s1.length();
        uni u = new uni();
        for (int i = 0; i < len; i++) {
            u.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        StringBuilder x = new StringBuilder();
        for (char c : baseStr.toCharArray())
            x.append((char) ('a' + u.find(c - 'a')));
        return x.toString();
    }
}

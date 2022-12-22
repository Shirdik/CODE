package Java.DAILY;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    static Set<Integer> s = new HashSet<>();

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        dfs(0, rooms);
        return s.size() == rooms.size();
    }

    private static void dfs(int i, List<List<Integer>> rooms) {
        s.add(i);
        for (int x : rooms.get(i)) {
            if (!s.contains(x))
                dfs(x, rooms);
        }
    }

    public static void main(String[] args) {

    }
}

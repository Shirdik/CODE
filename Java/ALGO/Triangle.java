package Java.ALGO;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size(), t[] = new int[len + 1];
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                t[j] = Math.min(t[j], t[j + 1]) + triangle.get(i).get(j);
            }
        }
        return t[0];
    }
}

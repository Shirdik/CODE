package Java;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> pascal(int rows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        list.add(temp1);
        if (rows == 1) {
            return list;
        }
        for (int i = 1; i < rows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        int rows = 8;

        System.out.println(pascal(rows));
    }
}

package Java.OTHER;

import java.util.*;

public class Duplicate {

    public static void main(String[] args) {

        int x[] = { 1, 2, 3, 4 };

        Set<Integer> set = new HashSet<Integer>();
        for (int i : x) {
            set.add(i);
        }
        System.out.println(x.length == set.size());

    }
}

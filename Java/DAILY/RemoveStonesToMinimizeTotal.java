package Java.DAILY;

import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTotal {
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> h = new PriorityQueue<>((a, b) -> b - a);
        for (int i : piles)
            h.add(i);
        for (int i = 0; i < k; i++) {
            int c = h.remove();
            int s = c / 2;
            h.add(c - s);
        }
        int r = 0;
        for (int i : h)
            r += i;
        return r;
    }

    public static void main(String[] args) {

    }
}

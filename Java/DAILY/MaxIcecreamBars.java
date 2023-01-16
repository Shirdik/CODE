package Java.DAILY;

import java.util.Arrays;

public class MaxIcecreamBars {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0, t = costs.length, i = 0;
        while (i < t && coins > 0) {
            if (costs[i] <= coins) {
                c++;
                coins -= costs[i];
            }
            i++;
        }
        return c;
    }

    public static void main(String[] args) {
        int costs[] = { 1, 3, 2, 4, 1 }, coins = 7;
        System.out.println(maxIceCream(costs, coins));

    }
}

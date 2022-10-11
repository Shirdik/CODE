package Java;

public class MaximumProfit {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int leastStock = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            leastStock = Math.min(leastStock, prices[i]);
            profit = Math.max(profit, prices[i] - leastStock);
        }

        System.out.println(profit);
    }
}

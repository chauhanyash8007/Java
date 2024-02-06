// Best time to buy & sell stock problem

// time complexity = O(n)

public class Array13 {
    public static int buyAndSellStocks(int prices[]) {
        int byePrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (byePrices < prices[i]) { // profit
                int profit = prices[i] - byePrices; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                byePrices = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buyAndSellStocks(prices));
    }
}

public class BestTimeToSellStockII {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profitLoss;
        for (int i = 0; i < prices.length - 1; i++) {
            profitLoss = prices[i + 1] - prices[i];
            if (profitLoss > 0) max += profitLoss;
        }
        return max;
    }
}

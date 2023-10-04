public class BestTimeToSellStock {

    public int maxProfit(int[] prices) {
        int max = 0;
        int localMax = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            localMax = prices[i] - minPrice;
            if (max < localMax) {
                max = localMax;
            }
        }
        return max;
    }
}

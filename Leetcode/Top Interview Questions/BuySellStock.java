class BuySellStock {
    // Best Time to Buy and Sell Stock II
    // Say you have an array prices for which the ith element is the price of a given stock on day i.
    // Design an algorithm to find the maximum profit.
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxValue = 0;
        for (int i=0; i<prices.length-1; i++) {
            if (prices[i+1] > prices[i]) {
                maxValue = maxValue + prices[i+1] - prices[i];
            }
        }
        return maxValue;
    }
}

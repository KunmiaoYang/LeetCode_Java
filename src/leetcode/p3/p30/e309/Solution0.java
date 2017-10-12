package leetcode.p3.p30.e309;

/**
 *
 * Created by admin on 2017/6/7.
 */
public class Solution0 {
    public int maxProfit(int[] prices) {
        return maxProfit(prices, 0);
    }
    int maxProfit(int[] prices, int beg) {
        int buy = beg, sell, profit, res = 0;
        while (buy + 1 < prices.length) {
            while (buy + 1 < prices.length && prices[buy + 1] <= prices[buy]) buy++;
            for (sell = buy + 1, profit = prices[buy]; sell < prices.length; sell++) {
                profit = Math.max(profit, prices[sell] + maxProfit(prices, sell + 2));
                if(sell + 2 < prices.length && prices[sell + 1] <= prices[sell] && prices[sell + 2] <= prices[sell]) break;
            }
            res = Math.max(res, profit - prices[buy++]);
        }
        return res;
    }
}

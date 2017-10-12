package leetcode.p3.p30.e309;

/**
 *
 * Created by admin on 2017/6/7.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int buy[] = new int[prices.length], sell[] = new int[prices.length], profit[] = new int[prices.length];
        buy[0] = 0;
        sell[0] = 0;
        profit[0] = 0;
        for (int i = 1; i<prices.length; i++) {
            profit[i] = profit[i - 1];
            buy[i] = buy[i - 1];
            sell[i] = sell[i - 1];
            if(prices[i] > prices[sell[i-1]]) {
                profit[i] = profit[i - 1] + prices[i] - prices[sell[i-1]];
                sell[i] = i;
            }
            if(prices[i] > prices[i-1]) {
                int j = i - 1, newProfit = -1;
                while (j > -1 && sell[j] > i - 3) j--;
                if(j < 0) newProfit = prices[i] - prices[i - 1];
                else if (sell[j] < i - 2) newProfit = profit[j] + prices[i] - prices[i - 1];
                if(newProfit > profit[i]) {
                    profit[i] = newProfit;
                    buy[i] = i-1;
                    sell[i] = i;
                }
            }
        }
        return profit[prices.length-1];
    }
}

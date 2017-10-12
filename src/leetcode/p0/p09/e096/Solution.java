package leetcode.p0.p09.e096;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/7/28.
 */
public class Solution {
    public int numTrees(int n) {
        if(n < 2) return 1;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0, 2, 1);
        for(int i = 2; i <= n; i++) for(int root = 1; root <= i; root++) dp[i] += dp[root - 1] * dp[i - root];
        return dp[n];
    }
}
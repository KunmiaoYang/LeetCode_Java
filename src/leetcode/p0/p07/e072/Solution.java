package leetcode.p0.p07.e072;

/**
 * Dynamic Program rules:
 * 1. Move right: Insert +1
 * 2. Move down: Delete +1
 * 3. Move right & down:
 *      3.1. chars1[i] == chars2[j]: Equal +0
 *      3.2. chars1[i] != chars2[j]: Replace +1
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray(), chars2 = word2.toCharArray();
        int m = chars1.length, n = chars2.length, dp[][] = new int[m][n];
        if(0 == m) return n;
        if(0 == n) return m;
        dp[0][0] = chars1[0] == chars2[0]? 0: 1;
        for(int i = 1; i < n; i++) dp[0][i] = chars1[0] == chars2[i]? i: dp[0][i - 1] + 1;
        for(int i = 1; i < m; i++) dp[i][0] = chars1[i] == chars2[0]? i: dp[i - 1][0] + 1;
        for(int i = 1; i < m; i++) for(int j = 1; j < n; j++) {
            dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
            dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + (chars1[i] == chars2[j]? 0: 1));
        }
        return dp[m - 1][n - 1];
    }
}
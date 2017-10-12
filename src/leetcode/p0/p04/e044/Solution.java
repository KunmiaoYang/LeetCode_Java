package leetcode.p0.p04.e044;

/**
 *
 * Created by kunmiao.yang on 2017/6/2.
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return false;
        char[] str = s.toCharArray(), pattern = p.toCharArray();
        int n = str.length, m = pattern.length, start = 0;
        boolean dp[][] = new boolean[n+1][m+1], run = true;
        dp[0][0] = true;
        for (int i = 0; i<m && dp[0][i]; i++) dp[0][i+1] = '*' == pattern[i];
        for (int i = 0; i<n && run; i++) {
            run = false;
            for (int j = start; j<m; j++) {
                if(!run) start = j;
                if(str[i] == pattern[j] || '?' == pattern[j]) {
                    dp[i+1][j+1] = dp[i][j];
                    run = true;
                }
                else if('*' == pattern[j]) {
                    dp[i+1][j+1] = dp[i][j+1] || dp[i+1][j];
                    run = true;
                }
            }
        }
//        for (boolean[] row: dp) {
//            System.out.print("[");
//            for(boolean val: row) System.out.print("\t" + (val?"1":"0"));
//            System.out.println("]");
//        }
        return dp[n][m];
    }
}
package leetcode.p0.p04.e044;

/**
 *
 * Created by kunmiao.yang on 2017/6/2.
 */
public class Solution0 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return false;
        char[] str = s.toCharArray(), pattern = p.toCharArray();
        int n = str.length, m = pattern.length;
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i<m && dp[0][i]; i++) dp[0][i+1] = '*' == pattern[i];
        for (int i = 0; i<n; i++) for (int j = 0; j<m; j++) {
            if(str[i] == pattern[j] || '?' == pattern[j]) dp[i+1][j+1] = dp[i][j];
            else if('*' == pattern[j]) dp[i+1][j+1] = dp[i][j+1] || dp[i+1][j];
        }
//        for (boolean[] row: dp) {
//            System.out.print("[");
//            for(boolean val: row) System.out.print("\t" + (val?"1":"0"));
//            System.out.println("]");
//        }
        return dp[n][m];
    }
}
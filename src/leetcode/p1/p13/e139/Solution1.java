package leetcode.p1.p13.e139;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 9/8/2017.
 */
class Solution1 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        if(0 == n) return true;
        boolean dp[][] = new boolean[n+1][n+1];
        Arrays.fill(dp[0], false);
        dp[0][0] = true;
        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j > -1; j--) {
                if(dp[i-1][j]) {
                    String sub = s.substring(j);
                    for(String word: wordDict) {
                        if(sub.startsWith(word))
                            dp[i][j+word.length()] = true;
                    }
                }
            }
            if(dp[i][n]) {
                for(boolean[] row: dp) {
                    System.out.print("[");
                    for(boolean e: row) System.out.print(" "+(e?1:0));
                    System.out.println("]");
                }
                return true;
            }
        }
        for(boolean[] row: dp) {
            System.out.print("[");
            for(boolean e: row) System.out.print(" "+(e?1:0));
            System.out.println("]");
        }
        return false;
    }
}
package leetcode.p1.p13.e139;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 9/8/2017.
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        if(0 == n) return true;
        boolean checked[] = new boolean[n];
        boolean dp[] = new boolean[n+1];
        //Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j > -1; j--) {
                if(dp[j] && !checked[j]) {
                    String sub = s.substring(j);
                    for(String word: wordDict)
                        if(sub.startsWith(word)) dp[j+word.length()] = true;
                    checked[j] = true;
                }
            }
            if(dp[n]) return true;
        }
        return false;
    }
}
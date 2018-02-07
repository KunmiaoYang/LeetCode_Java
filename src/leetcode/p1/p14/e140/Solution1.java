package leetcode.p1.p14.e140;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 11/22/2017.
 */
public class Solution1 {
    int n, m;
    String[] wordArr;
    public List<String> wordBreak(String s, List<String> wordDict) {
        n = s.length();
        m = wordDict.size();
        wordArr = wordDict.toArray(new String[0]);
        int len[] = new int[m], dp[][] = new int[n + 1][m + 1];
        dp[0][m] = 1;
        for(int j = 0; j < m; j++) len[j] = wordArr[j].length();
        for(int i = 1; i <= n; i++) {
            String sub = s.substring(0, i);
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
                if(sub.endsWith(wordArr[j])) {
                    int pre = i - len[j];
                    if(0 == dp[pre][m]) continue;
                    dp[i][j] = pre;
                    dp[i][m] = 1;
                }
            }
        }
        List<String> res = new LinkedList<>();
        if(0 != dp[n][m]) dfs(res, new LinkedList<>(), n, dp);
        return res;
    }
    private void dfs(List<String> res, LinkedList<String> seq, int level, int[][] dp) {
        if(0 == level) {
            res.add(String.join(" ", seq));
            return;
        }
        for(int j = 0; j < m; j++) {
            if(dp[level][j] > -1) {
                seq.push(wordArr[j]);
                dfs(res, seq, dp[level][j], dp);
                seq.pop();
            }
        }
    }
}

package leetcode.p1.p14.e140;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 11/22/2017.
 */
public class Solution0 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        List<String> dp[] = new List[n + 1];
        for(int i = 1; i <= n; i++) {
            dp[i] = new LinkedList<>();
            String subString = s.substring(0, i);
            for(String word: wordDict) {
                if(subString.endsWith(word)) {
                    int pre = i - word.length();
                    if(0 == pre) dp[i].add(word);
                    else if(dp[pre].isEmpty()) continue;
                    else for(String prefix: dp[pre]) dp[i].add(String.format("%s %s", prefix, word));
                }
            }
        }
        return dp[n];
    }
}

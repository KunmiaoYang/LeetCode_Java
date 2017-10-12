package leetcode.p1.p13.e139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * Created by Kunmiao Yang on 9/8/2017.
 */
class Solution0 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<>(wordDict));
    }
    public boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        if(0 == n) return true;
        for(int i = 1; i <= n; i++) {
            String sub = s.substring(0, i);
            if(wordDict.contains(sub) && wordBreak(s.substring(i), wordDict)) return true;
        }
        return false;
    }
}
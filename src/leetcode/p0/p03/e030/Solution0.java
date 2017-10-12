package leetcode.p0.p03.e030;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution0 {
    public List<Integer> findSubstring(String s, String[] words) {
        if(null == s || 0==s.length()) return null;
        char chars[] = s.toCharArray(), patterns[][];
        int n = chars.length, m = words.length;
        int len[] = new int[m], nextMatrix[][] = new int[m][], k[] = new int[m];
        patterns = new char[m][];
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i<m; i++) {
            patterns[i] = words[i].toCharArray();
            len[i] = patterns[i].length;
            if(0==len[i]) {
                res.add(0);
                k[i] = 1;
            } else {
                k[i] = 0;
                nextMatrix[i] = getNextArray(patterns[i], len[i]);
            }
        }
        for(int i = 0; i<n; i++) {
            words: for(int j = 0; j<m; j++){
                while (k[j]<len[j] && chars[i]!=patterns[j][k[j]]) {
                    if(k[j]<1) continue words;
                    k[j] = nextMatrix[j][k[j]];
                }
                k[j]++;
                if(len[j] == k[j])
                    res.add(i + 1 - k[j]++);
            }
        }
        return res;
    }
    public int[] getNextArray(char[] pattern, int n) {
        int next[] = new int[n], j = 0;
        outer: for (int i = 1; i<n-1;) {
            while (pattern[i]!=pattern[j]) {
                if(j>0) j = next[j];
                else {
                    i++;
                    continue outer;
                }
            }
            next[++i] = ++j;
        }
        return next;
    }
}
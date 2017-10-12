package leetcode.p0.p03.e030;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution3 {
    char[] chars;
    int n, m, len;
    List<Integer> res;
    HashMap<String, Integer> countMap;
    public List<Integer> findSubstring(String s, String[] words) {
        if(null == s || 0==s.length()) return null;
        res = new LinkedList<>();
        chars = s.toCharArray();
        n = chars.length; m = words.length;
        if(0==m) return res;
        len = words[0].length();
        if(len==0) {
            res.add(0);
            return res;
        }
        countMap = new HashMap<>();
        for(int i = 0; i<m; i++) countMap.put(words[i], countMap.getOrDefault(words[i], 0)+1);
        int searchEnd = n - m*len + 1;
        for(int i = 0; i<searchEnd; i++) findSubstring(i, m);
        return res;
    }
    public void findSubstring(int beg, int residual) {
        if(0==residual) res.add(beg - m*len);
        else for(String word: countMap.keySet()) {
            int count = countMap.get(word);
            if(count>0 && match(beg, word)) {
                countMap.put(word, count-1);
                findSubstring(beg + len, residual-1);
                countMap.put(word, count);
                break;
            }
        }
    }
    public boolean match(int beg, String word) {
        for(int i = 0, j = beg; i<len; i++, j++) if(word.charAt(i) != chars[j]) return false;
        return true;
    }
}
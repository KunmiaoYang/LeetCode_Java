package leetcode.p0.p03.e030;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution2 {
    char[] chars;
    char[][] wordChars;
    int n, m, len;
    List<Integer> res;
    HashSet<Integer> contain;
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
        wordChars = new char[m][];
        contain = new HashSet<>();
        for(int i = 0; i<m; i++) {
            wordChars[i] = words[i].toCharArray();
            contain.add(i);
        }
        int searchEnd = n - m*len + 1;
        for(int i = 0; i<searchEnd; i++) findSubstring(i);
        return res;
    }
    public void findSubstring(int beg) {
        if(contain.isEmpty()) res.add(beg - m*len);
        else for(int i: contain) {
            if(match(beg, i)) {
                contain.remove(i);
                findSubstring(beg + len);
                contain.add(i);
                break;
            }
        }
    }
    public boolean match(int beg, int index) {
        for(int i = 0, j = beg; i<len; i++, j++) if(wordChars[index][i] != chars[j]) return false;
        return true;
    }
}
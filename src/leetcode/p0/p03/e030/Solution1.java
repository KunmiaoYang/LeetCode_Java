package leetcode.p0.p03.e030;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution1 {
    public List<Integer> findSubstring(String s, String[] words) {
        if(null == s || 0==s.length()) return null;
        List<Integer> res = new LinkedList<>();
        char chars[] = s.toCharArray(), word[];
        int n = chars.length, m = words.length, matchCount;
        if(0==m) return res;
        int len = words[0].length();
        if(len==0) {
            res.add(0);
            return res;
        } else word = words[m-1].toCharArray();
        LinkedList<Integer> ocurList = new LinkedList<>();
        outer: for(int i = 0; i<n-len+1; i++) {
            for(int j = 0, k = i; j<len; j++, k++) if(word[j]!=chars[k]) continue outer;
            ocurList.add(i);
        }
        if(ocurList.isEmpty()) return res;
        res.add(ocurList.getFirst());

        for(int i = m-2; i>-1; i--) {
            word = words[i].toCharArray();
            matchCount = ocurList.size();
            match: for(int j = 0, k, l; j<matchCount; j++) {
                int end = ocurList.pop();
                if(end<len) continue;
                for(k = len, l = end; k>0;) if(word[--k]!=chars[--l]) continue match;
                ocurList.add(l);
            }
            if(ocurList.isEmpty()) break;
            else res.add(ocurList.getFirst());
        }

        return res;
    }
}
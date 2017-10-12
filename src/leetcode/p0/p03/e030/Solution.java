package leetcode.p0.p03.e030;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/5/24.
 */
public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new LinkedList<>();
        if(null == s || s.length() == 0) return res;
        int n = s.length(), m = words.length, len, searchLimit;
        if( 0 == m) {
            res.add(0);
            return res;
        } else len = words[0].length();
        HashMap<String, Integer> countMapOrg = new HashMap<>();
        for (String word : words) countMapOrg.put(word, countMapOrg.getOrDefault(word, 0) + 1);
        String front = null, tail;
        searchLimit = n - m*len;
        for(int i = 0; i<len; i++) {
            boolean refresh = true;
            HashMap<String, Integer> countMap = (HashMap<String, Integer>) countMapOrg.clone();
            LinkedList<String> window = new LinkedList<>();
            for(int j = i, k = i; j<=searchLimit; ) {
                if(refresh) front = s.substring(k, k+len);
                int count = countMap.getOrDefault(front, 0);
                if(count>0) {
                    window.add(front);
                    countMap.put(front, count - 1);
                    k+=len;
                    refresh = true;
                    if(window.size() == m) {
                        res.add(j);
                        j+=len;
                        tail = window.pop();
                        countMap.put(tail, countMap.get(tail) + 1);
                    }
                } else if(countMapOrg.getOrDefault(front, 0)>0) {
                    do {
                        j+=len;
                        tail = window.pop();
                        countMap.put(tail, countMap.get(tail) + 1);
                    } while (!tail.equals(front));
                    refresh = false;
                } else if(k+len>searchLimit) break;
                else {
                    k+=len;
                    refresh = true;
                    j = k;
                    while (!window.isEmpty()) {
                        tail = window.pop();
                        countMap.put(tail, countMap.get(tail) + 1);
                    }
                }
            }
        }
        return res;
    }
}

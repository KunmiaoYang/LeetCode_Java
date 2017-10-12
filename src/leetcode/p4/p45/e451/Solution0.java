package leetcode.p4.p45.e451;

import java.util.*;

/**
 *
 * Created by admin on 2017/6/28.
 */
public class Solution0 {
    public String frequencySort(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        Map<Character, Integer> bucket = new HashMap<>();
        Set<Character>[] sortSet = new Set[n + 1];
        for(char c: chars) bucket.put(c, bucket.getOrDefault(c, 0) + 1);
        for(Character c: bucket.keySet()) {
            int i = bucket.get(c);
            if(null == sortSet[i]) sortSet[i] = new HashSet<>();
            sortSet[i].add(c);
        }
        for(int i = n, j = 0; i > 0; i--) if(null != sortSet[i]) for(Character c: sortSet[i]) Arrays.fill(chars, j, j += i, c);
        return new String(chars);
    }
}
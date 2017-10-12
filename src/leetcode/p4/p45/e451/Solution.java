package leetcode.p4.p45.e451;

import java.util.*;

/**
 *
 * Created by admin on 2017/6/28.
 */
public class Solution {
    public String frequencySort(String s) {
        int n = s.length(), bucket[] = new int[128];
        char[] chars = s.toCharArray();
        Set<Character>[] sortSet = new Set[n + 1];
        for(char c: chars) bucket[c]++;
        for(char c = ' '; c < 128; c++) {
            int i = bucket[c];
            if(null == sortSet[i]) sortSet[i] = new HashSet<>();
            sortSet[i].add(c);
        }
        for(int i = n, j = 0; i > 0; i--) if(null != sortSet[i]) for(Character c: sortSet[i]) Arrays.fill(chars, j, j += i, c);
        return new String(chars);
    }
}
package leetcode.p0.p07.e076;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution0 {
    public String minWindow(String s, String t) {
        int n = s.length(), left = 0, right = 0, p = 0, len = Integer.MAX_VALUE, minLeft = 0, minRight = -1, leftCount;
        int[] indices = new int[n];
        if(s.equals("") || t.equals("")) return "";
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c: t.toCharArray()) charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        leftCount = charMap.size();
        while (true) {
            char c = 0;
            int count;
            if(leftCount == 0) {
                if (len > p - indices[left]) {
                    minLeft = left;
                    minRight = right - 1;
                    len = p - indices[left];
                }
                c = s.charAt(indices[left++]);
                assert 0 == charMap.get(c);
                charMap.put(c, charMap.get(c) + 1);
                leftCount++;
            }
            while (p < n && !charMap.keySet().contains(c = s.charAt(p))) p++;
            if(n == p) break;
            indices[right++] = p++;
            charMap.put(c, count = charMap.get(c) - 1);
            if(count == 0) leftCount--;
            count = charMap.get(c = s.charAt(indices[left]));
            while (left < right && count < 0) {
                charMap.put(c, count + 1);
                count = charMap.get(c = s.charAt(indices[++left]));
            }
        }
        return minRight > -1? s.substring(indices[minLeft], indices[minRight] + 1): "";
    }
}
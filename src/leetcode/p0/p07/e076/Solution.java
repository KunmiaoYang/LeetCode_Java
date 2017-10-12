package leetcode.p0.p07.e076;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * Created by admin on 2017/6/21.
 */
public class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), left = 0, right = 0, p = 0, len = Integer.MAX_VALUE, minLeft = 0, minRight = 0;
        int[] indices = new int[n];
        if(s.equals("") || t.equals("")) return "";
        List<Character> charNotExist = new LinkedList<>();
        Set<Character> charSet;
        for(char c: t.toCharArray()) charNotExist.add(c);
        charSet = new HashSet<>(charNotExist);
        while (true) {
            if(charNotExist.isEmpty()) {
                if (len > p - indices[left]) {
                    minLeft = left;
                    minRight = right - 1;
                }
                charNotExist.add(s.charAt(indices[left++]));
            }
            char c = 0;
            while (p < n && !charSet.contains(c = s.charAt(p))) p++;
            if(n == p) break;
            // ?
            while (left < right && s.charAt(indices[left]) == c) left++;
            while (left + 1 < right && s.charAt(indices[left]) == s.charAt(indices[left + 1])) left++;
            indices[right++] = p++;
            charNotExist.remove(c);
        }
        return s.substring(indices[minLeft], indices[minRight] + 1);
    }
}
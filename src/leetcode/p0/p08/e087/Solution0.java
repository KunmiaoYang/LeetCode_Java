package leetcode.p0.p08.e087;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Solution0 {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        return s2.length() == n &&(0 == n || isScramble(s1.toCharArray(), 0, n - 1, s2.toCharArray(), 0, n - 1));
    }
    boolean isScramble(char[] chars1, int l1, int r1, char[] chars2, int l2, int r2) {
        if(l1 == r1 && chars1[l1] == chars2[l2]) return true;
        int mid1 = (l1 + r1 + 1) / 2, mid2;
        Set<Character> leftChars = new HashSet<>();
        for(int i = l1; i < mid1; i++) leftChars.add(chars1[i]);
        if(leftChars.contains(chars2[l2])) {
            mid2 = (l2 + r2 + 1) / 2;
            if(isScramble(chars1, l1, mid1 - 1, chars2, l2, mid2 - 1) &&
            isScramble(chars1, mid1, r1, chars2, mid2, r2)) return true;
        }
        if(leftChars.contains(chars2[r2])) {
            mid2 = (l2 + r2) / 2;
            if(isScramble(chars1, l1, mid1 - 1, chars2, mid2 + 1, r2) &&
            isScramble(chars1, mid1, r1, chars2, l2, mid2)) return true;
        }
        return false;
    }
}
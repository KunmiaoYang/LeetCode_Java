package leetcode.p0.p08.e087;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Solution {
    char[] chars1, chars2;
    int[][] countMap1, countMap2;
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        if(s2.length() != n) return false;
        if(0 == n) return true;
        chars1 = s1.toCharArray();
        chars2 = s2.toCharArray();
        countMap1 = new int[n + 1][26];
        countMap2 = new int[n + 1][26];
        for(int i = 0; i < n; i++) {
            System.arraycopy(countMap1[i], 0, countMap1[i + 1], 0, 26);
            System.arraycopy(countMap2[i], 0, countMap2[i + 1], 0, 26);
            countMap1[i + 1][chars1[i] - 'a']++;
            countMap2[i + 1][chars2[i] - 'a']++;
        }
        return isScramble(0, n - 1, 0, n - 1);
    }
    boolean isScramble(int l1, int r1, int l2, int r2) {
        if(l1 == r1 && chars1[l1] == chars2[l2]) return true;
        for(int i = 0; i < 26; i++) if(countMap1[r1 + 1][i] - countMap1[l1][i] != countMap2[r2 + 1][i] - countMap2[l2][i]) return false;
        int n = r1 - l1;
        for(int i = 0; i < n; i++) {
            if((isScramble(l1, l1 + i, l2, l2 + i) && isScramble(l1 + i + 1, r1, l2 + i + 1, r2)) ||
               (isScramble(l1, l1 + i, r2 - i, r2) && isScramble(l1 + i + 1, r1, l2, r2 - i - 1)))
                return true;
        }
        return false;
    }
}
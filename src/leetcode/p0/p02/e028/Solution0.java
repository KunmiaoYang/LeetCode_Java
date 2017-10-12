package leetcode.p0.p02.e028;

/**
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution0 {
    public int strStr(String haystack, String needle) {
        if(null == haystack || null == needle) return -1;
        char[] chars = haystack.toCharArray(), pattern = needle.toCharArray();
        int nc = chars.length, np = pattern.length;
        if(np == 0) return 0;
        if(nc<np) return -1;
        int next[] = getNextArray(pattern, np), i = 0, j = 0;
        while (i<nc && j<np) {
            if(chars[i]!=pattern[j]) {
                if(0 == j) i++;
                else j = next[j];
            } else {
                i++; j++;
            }
        }
        if(j==np) return i - np;
        return -1;
    }
    public int[] getNextArray(char[] pattern, int n) {
        int next[] = new int[n], j = 0;
        outer: for (int i = 1; i<n-1;) {
            while (pattern[i]!=pattern[j]) {
                if(j>0) j = next[j];
                else {
                    i++;
                    continue outer;
                }
            }
            next[++i] = ++j;
        }
        return next;
    }
}
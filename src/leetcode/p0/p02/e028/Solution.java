package leetcode.p0.p02.e028;

/**
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(null == haystack || null == needle) return -1;
        char[] chars = haystack.toCharArray(), pattern = needle.toCharArray();
        int nc = chars.length, np = pattern.length;
        if(np == 0) return 0;
        outer: for(int i = 0; i<nc-np+1; i++) {
            for(int j = 0, k = i; j<np; j++, k++) if(pattern[j]!=chars[k]) continue outer;
            return i;
        }
        return -1;
    }
}
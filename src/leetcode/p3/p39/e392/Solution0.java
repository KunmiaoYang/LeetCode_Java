package leetcode.p3.p39.e392;

/**
 *
 * Created by admin on 2017/7/5.
 */
public class Solution0 {
    public boolean isSubsequence(String s, String t) {
        if(null == s || "".equals(s)) return true;
        int i = 0, n = s.length();
        char[] chars = s.toCharArray();
        for(char c: t.toCharArray()) if(chars[i] == c && ++i == n) return true;
        return false;
    }
}
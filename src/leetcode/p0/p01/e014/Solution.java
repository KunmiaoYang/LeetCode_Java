package leetcode.p0.p01.e014;

/**
 * Created by kunmiao.yang on 2017/5/18.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(null == strs || 1 > strs.length) return "";
        if(1 == strs.length) return strs[0];
        int len;
        for(len = 0; len<strs[0].length(); len++) {
            char c0 = strs[0].charAt(len);
            try {
                for (int i = 1; i < strs.length; i++) if (strs[i].charAt(len) != c0) return strs[0].substring(0, len);
            } catch (StringIndexOutOfBoundsException e) {
                return strs[0].substring(0, len);
            }
        }
        return strs[0];
    }
}
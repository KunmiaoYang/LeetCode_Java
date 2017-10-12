package leetcode.p0.p01.e010;

/**
 * Created by kunmiao.yang on 2017/5/16.
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        char[] str = s.toCharArray(),
                pattern = p.toCharArray();
        int i, j;
        for(i = 0, j = 0; i<pattern.length && j<str.length; i++) {
            if(isMatch(str[j], pattern[i])) j++;
            else if(i+1<pattern.length && '*'==pattern[i+1]) return isMatch(s.substring(j), p.substring(i+2));
            else if('*'==pattern[i]) {
                char rep = pattern[i-1];
                while (j<s.length()) {
                    if(isMatch(s.substring(j), p.substring(i+1))) return true;
                    else if(!isMatch(str[j], rep)) return false;
                    j++;
                }
            } else return false;
        }
        return str.length == j && (pattern.length == i || pattern.length == i + 2 && '*' == pattern[pattern.length - 1]);
    }

    public boolean isMatch(char c, char p) {
        if('.'==p) return true;
        return c == p;
    }
}

package leetcode.p0.p09.e091;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution0 {
    public int numDecodings(String s) {
        if(s.equals("")) return 0;
        return dfs(s, false, 0, 0, s.length() - 1);
    }
    private int dfs(String s, boolean hasPrev, int prev, int p, int end) {
        int digit = s.charAt(p) - '0', num = digit + (hasPrev? 10*prev: 0);
        if(num > 0 && num < 27) {
            if(p == end) return 1;
            if(hasPrev) return dfs(s, false, 0, p + 1, end);
            return dfs(s, false, 0, p + 1, end) + dfs(s, true, digit, p + 1, end);
        } else return 0;
    }
}
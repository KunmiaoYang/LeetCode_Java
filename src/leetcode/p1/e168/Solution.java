package leetcode.p1.e168;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        for (; n > 0; n = n/26) sb.append((char)((--n)%26 + 'A'));
        return sb.reverse().toString();
    }
}
package leetcode.p0.p05.e058;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int count, i = s.length() - 1;
        while (i > -1 && ' ' == s.charAt(i)) i--;
        count = i;
        while (i > -1 && ' ' != s.charAt(i)) i--;
        return count - i;
    }
}
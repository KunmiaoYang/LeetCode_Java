package leetcode.p0.p05.e058;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution0 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
}
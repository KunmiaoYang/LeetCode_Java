package leetcode.p0.p03.e038;

/**
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i<n; i++) res = countAndSay(res);
        return res;
    }
    String countAndSay(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0, n = s.length(), count;
        while (i<n) {
            char c = s.charAt(i);
            for (count = 1; ++i<n && s.charAt(i) == c; count++);
            res.append(count).append(c);
        }
        return res.toString();
    }
}
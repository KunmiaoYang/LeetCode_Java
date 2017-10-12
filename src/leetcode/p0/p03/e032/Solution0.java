package leetcode.p0.p03.e032;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution0 {
    public int longestValidParentheses(String s) {
        if(null == s) return 0;
        char[] chars = s.toCharArray();
        int left = 0, right = 0, count = 0, sum = 0, n = chars.length;
        while (right<n) {
            switch (chars[right++]) {
                case '(': sum++; break;
                case ')':
                    if(sum>0) {
                        sum--;
                        if(0 == sum) count = Math.max(right - left, count);
                    } else left = right;
                    break;
            }
        }
        if(sum>0) {
            int leftBound = left;
            left = n - 1; right = n - 1; sum = 0;
            while (left>leftBound) {
                switch (chars[left--]) {
                    case ')': sum++; break;
                    case '(':
                        if(sum>0) {
                            sum--;
                            if(0 == sum) count = Math.max(right - left, count);
                        } else right = left;
                        break;
                }
            }
        }
        return count;
    }
}
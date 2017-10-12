package leetcode.p0.p06.e066;

/**
 *
 * Created by admin on 2017/6/19.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for (i = digits.length - 1; i > -1 && 9 == digits[i]; i--) digits[i] = 0;
        if(-1 == i) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        digits[i]++;
        return digits;
    }
}

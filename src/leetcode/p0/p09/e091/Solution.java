package leetcode.p0.p09.e091;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution {
    public int numDecodings(String s) {
        int single = 0, singlePrev = 0, dual = 0, dualPrev = 1, digitPrev = 0;
        for(char c: s.toCharArray()) {
            int digit = c - '0', num = 10*digitPrev + digit;
            single = 0 == digit? 0: singlePrev + dualPrev;
            dual = num > 0 && num < 27? singlePrev: 0;
            digitPrev = digit;
            singlePrev = single;
            dualPrev = dual;
        }
        return single + dual;
    }
}
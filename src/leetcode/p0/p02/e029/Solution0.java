package leetcode.p0.p02.e029;

/**
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution0 {
    public int divide(int dividend, int divisor) {
        if(0 == divisor) return Integer.MAX_VALUE;
        int sign = 1;
        if(dividend<0) {
            if(divisor>0) {
                divisor = -divisor;
                sign = -1;
            }
        } else {
            dividend = -dividend;
            if(divisor>0) divisor = -divisor;
            else sign = -1;
        }
        long res = 0, multiple, multiDivisor;
        while (dividend<=divisor)
            for (multiple = sign, multiDivisor = divisor; dividend<=multiDivisor; dividend-=multiDivisor, multiple+=multiple, multiDivisor+=multiDivisor)
                res+=multiple;
        if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)res;
    }
}
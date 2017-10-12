package leetcode.p0.p05.e050;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Solution0 {
    public double myPow(double x, int n) {
        if(n<0) return 1/ myPowLong(x, -(long) n);
        return myPowLong(x, n);
    }
    private double myPowLong(double x, long n) {
        double res = 1;
        for (double factor = x; n != 0; n >>= 1, factor *= factor) if(1 == (n&1)) res *= factor;
        return res;
    }
}
package leetcode.p0.p05.e050;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Solution {
    public double myPow(double x, int n) {
        if(0 == x) return 0;
        if(Integer.MIN_VALUE == n) return 1/myPowPositive(x*x, 1073741824);
        if(n<0) return 1/ myPowPositive(x, -n);
        return myPowPositive(x, n);
    }
    private double myPowPositive(double x, int n) {
        if(0 == n) return 1;
        return 1 == (n&1) ? x * myPowPositive(x * x, n >> 1): myPowPositive(x * x, n >> 1);
    }
}
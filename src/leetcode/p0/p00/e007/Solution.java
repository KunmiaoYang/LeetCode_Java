package leetcode.p0.p00.e007;

/**
 * Created by admin on 2017/5/13.
 */
public class Solution {
    public int reverse(int x) {
        int unsigned = Math.abs(x);
        long res = 0;
        while (unsigned>0) {
            res = 10*res + unsigned%10;
            unsigned /= 10;
        }
        res = x>0? res: -res;
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        return (int) res;
    }
}

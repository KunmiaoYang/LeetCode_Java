package leetcode.p0.p06.e069;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Solution {
    public int mySqrt(int x) {
        long multi = 0, mid;
        int left = 0, right = x;
        while (left < right) {
            mid = (left + (long) right + 1) / 2;
            if(x < mid * mid) right = (int) mid - 1;
            else left = (int) mid;
        }
        return left;
    }
}
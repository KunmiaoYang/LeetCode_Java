package leetcode.p3.p37.e372;

/**
 *
 * Created by admin on 2017/5/30.
 */
public class Solution {
    public int superPow(int a, int[] b) {
        a %= 1337;
        int result = 1, residual, j;
        for(int i: b) {
            for(j = 1, residual = result; j<10; j++) residual = (residual*result)%1337;
            result = residual;
            for(j = 0; j<i; j++) result = (result*a)%1337;
        }
        return result;
    }
}